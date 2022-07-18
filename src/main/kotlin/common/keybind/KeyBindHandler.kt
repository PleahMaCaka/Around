package com.pleahmacaka.examplemod

import com.pleahmacaka.examplemod.common.keybind.KeyBindings.KB_DOWN
import com.pleahmacaka.examplemod.common.keybind.KeyBindings.KB_LEFT
import com.pleahmacaka.examplemod.common.keybind.KeyBindings.KB_RIGHT
import com.pleahmacaka.examplemod.common.keybind.KeyBindings.KB_UP
import com.pleahmacaka.examplemod.common.keybind.KeyBindings.KEYBINDINGS
import net.minecraft.client.KeyMapping
import net.minecraft.client.Minecraft
import net.minecraft.client.player.LocalPlayer
import net.minecraftforge.client.event.InputEvent
import org.lwjgl.glfw.GLFW

object KeyBindHandler {

    fun onKeyInput(event: InputEvent.KeyInputEvent) {
        val key = KEYBINDINGS.find { keyMapping ->
            keyMapping.key.value == event.key
        } ?: return

        val player: LocalPlayer = Minecraft.getInstance().player ?: return

        when (event.action) {
            GLFW.GLFW_REPEAT -> {
                pressed(key)
            }

            GLFW.GLFW_PRESS -> {
                pressed(key)
            }
        }
    }

    private fun pressed(kb: KeyMapping) {
        val player: LocalPlayer = Minecraft.getInstance().player ?: return

        when (kb) {
            KB_UP -> player.xRot = player.xRot - 2f

            KB_DOWN -> player.xRot = player.xRot + 2f

            KB_LEFT -> player.yRot = player.yRot - 2f

            KB_RIGHT -> player.yRot = player.yRot + 2f
        }
    }

}