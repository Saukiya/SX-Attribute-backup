package github.saukiya.sxattribute.data.condition.sub;

import github.saukiya.sxattribute.data.condition.SXConditionType;
import github.saukiya.sxattribute.data.condition.SubCondition;
import github.saukiya.sxattribute.util.Config;
import github.saukiya.sxattribute.util.Message;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

/**
 * @author Saukiya
 */
public class MainHandCondition extends SubCondition {

    public MainHandCondition() {
        super("MainHand", SXConditionType.MAIN_HAND);
    }

    @Override
    public boolean determine(LivingEntity entity, ItemStack item, String lore) {
        if (lore.contains(Config.getConfig().getString(Config.NAME_HAND_OFF))) {
            if (item != null)
                Message.send(entity, Message.PLAYER__NO_USE_SLOT, getItemName(item), Config.getConfig().getString(Config.NAME_HAND_OFF));
            return true;
        }
        return false;
    }
}
