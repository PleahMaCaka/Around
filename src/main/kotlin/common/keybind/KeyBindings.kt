package com.pleahmacaka.examplemod.common.keybind

import com.mojang.blaze3d.platform.InputConstants
import net.minecraft.client.KeyMapping
import net.minecraftforge.client.settings.KeyConflictContext
import org.lwjgl.glfw.GLFW

object KeyBindings {

    private const val CATEGORY = "Around"

    val KB_UP = KeyMapping(
        "Up",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_KP_8,
        CATEGORY
    )

    val KB_DOWN = KeyMapping(
        "Down",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_KP_2,
        CATEGORY
    )

    val KB_LEFT = KeyMapping(
        "Left",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_KP_4,
        CATEGORY
    )

    val KB_RIGHT = KeyMapping(
        "Right",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_KP_6,
        CATEGORY
    )

    val KEYBINDINGS = hashSetOf(KB_UP, KB_DOWN, KB_LEFT, KB_RIGHT)
}