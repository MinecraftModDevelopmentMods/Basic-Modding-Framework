package com.mcmoddev.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod(
        modid = ExampleMainClass.MODID,
        name = ExampleMainClass.NAME,
        version = ExampleMainClass.VERSION,
        updateJSON = ExampleMainClass.UPDATE_JSON,
        certificateFingerprint = "@FINGERPRINT@",
        acceptedMinecraftVersions = ExampleMainClass.MC_VERSION
)
public class ExampleMainClass {

    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "0.0.0";
    public static final String UPDATE_JSON = "https://raw.githubusercontent.com/MinecraftModDevelopmentMods/examplemod/master/update.json";
    public static final String MC_VERSION = "[1.9, 1.9.4]";
    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @Mod.EventHandler
    public void onFingerprintViolation(@Nonnull FMLFingerprintViolationEvent event) {
        LOGGER.warn("Invalid fingerprint detected! The file " + event.getSource().getName() +
                " may have been tampered with. This version will NOT be supported! Please download the mod from " +
                "CurseForge for a supported and signed version of the mod.");
    }
}
