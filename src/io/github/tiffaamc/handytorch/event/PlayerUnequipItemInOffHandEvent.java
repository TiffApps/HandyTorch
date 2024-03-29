package io.github.tiffaamc.handytorch.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

/**
 * Event for a player un-equipping an item
 */
public class PlayerUnequipItemInOffHandEvent extends Event
{

    private static final HandlerList handlers = new HandlerList();

    private final Player    player;
    private final ItemStack item;
    private final int       slot;

    /**
     * Constructor
     *
     * @param player player un-equipping the item
     * @param item   item that was un-equipped
     * @param slot   the slot the item was unequipped from
     */
    public PlayerUnequipItemInOffHandEvent(Player player, ItemStack item, int slot)
    {
        this.player = player;
        this.item = item;
        this.slot = slot;
    }

    public PlayerUnequipItemInOffHandEvent(Player player, ItemStack item)
    {
        this.player = player;
        this.item = item;
        this.slot = 45;
    }
    
    /**
     * @return player un-equipping the item
     */
    public Player getPlayer()
    {
        return player;
    }

    /**
     * @return item that was un-equipped
     */
    public ItemStack getItem()
    {
        return item;
    }

    /**
     * @return armor slot that was equipped
     */
    public int getSlot()
    {
        return slot;
    }

    /**
     * @return handlers for this event
     */
    @Override
    public HandlerList getHandlers()
    {
        return handlers;
    }

    /**
     * @return handlers for this event
     */
    public static HandlerList getHandlerList()
    {
        return handlers;
    }
}
