package plus.dragons.createenchantmentindustry.foundation.ponder.content;

import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.foundation.ponder.PonderRegistry;
import net.minecraft.world.item.Items;
import plus.dragons.createenchantmentindustry.EnchantmentIndustry;
import plus.dragons.createenchantmentindustry.entry.ModBlocks;
import plus.dragons.createenchantmentindustry.entry.ModItems;
import plus.dragons.createenchantmentindustry.foundation.ponder.ModPonderTag;

public class ModPonderIndex {
    static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(EnchantmentIndustry.MOD_ID);

    //TODO See PonderIndex

    public static void register() {
        HELPER.forComponents(ModBlocks.DISENCHANTER)
                .addStoryBoard("disenchant",EnchantmentScenes::disenchant, ModPonderTag.EXPERIENCE);
    }

    public static void registerTags() {
        PonderRegistry.TAGS.forTag(ModPonderTag.EXPERIENCE)
                .add(ModBlocks.DISENCHANTER)
                .add(ModBlocks.COPIER)
                .add(ModItems.ENCHANTING_GUIDE_FOR_BLAZE)
                .add(Items.EXPERIENCE_BOTTLE);
    }

}
