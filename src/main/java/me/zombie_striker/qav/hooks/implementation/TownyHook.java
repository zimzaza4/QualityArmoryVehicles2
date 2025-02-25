package me.zombie_striker.qav.hooks.implementation;

import com.palmergames.bukkit.towny.object.TownyPermission;
import com.palmergames.bukkit.towny.utils.PlayerCacheUtil;
import me.zombie_striker.qav.hooks.ProtectionHook;
import me.zombie_striker.qav.util.BlockCollisionUtil;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class TownyHook implements ProtectionHook {

    @Override
    public boolean canBreak(Player player, Location location) {
        return PlayerCacheUtil.getCachePermission(player, location, BlockCollisionUtil.getMaterial(location),
                TownyPermission.ActionType.DESTROY);
    }

}
