package com.pleahmacaka.examplemod

import com.pleahmacaka.examplemod.common.keybind.KeyBindings
import net.minecraftforge.client.ClientRegistry
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.FORGE_BUS
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(ExampleMod.MODID)
object ExampleMod {

    const val MODID = "examplemod" // around

    private val LOGGER: Logger = LogManager.getLogger()

    init {
        LOGGER.log(Level.INFO, "$MODID has started!")

        MOD_BUS.addListener(::onClientSetup)
        FORGE_BUS.addListener(::onDedicatedServerSetupEvent)

        KeyBindings.KEYBINDINGS.forEach { ClientRegistry.registerKeyBinding(it) }
        FORGE_BUS.addListener(KeyBindHandler::onKeyInput)
    }

    /**
     * Initializing client
     * things such as renderers and keymaps
     * Fired on the mod specific event bus.
     */
    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.log(Level.INFO, "Initializing client...")
    }

    /**
     * Fired on the global Forge bus.
     */
    private fun onDedicatedServerSetupEvent(event: FMLDedicatedServerSetupEvent) {
        LOGGER.log(Level.INFO, "Server starting...")
    }

}