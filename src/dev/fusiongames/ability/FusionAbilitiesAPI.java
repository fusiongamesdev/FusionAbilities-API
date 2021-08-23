package dev.fusiongames.ability;

import dev.fusiongames.ability.ability.Ability;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

public class FusionAbilitiesAPI {

    public static FusionAbilitiesAPI INSTANCE;

    public FusionAbilitiesAPI() {
    }

    public List<Ability> getAbilities() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

}
