package net.funshinex.example.entities;

import net.funshinex.example.blocks.BlockInfo;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/17/13
 * Time: 11:38 AM
 */
public class EntityBomb extends Entity {

    public EntityBomb(World world) {
        super(world);

        motionY = -0.6;
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {

    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (!worldObj.isRemote) {
            if (worldObj.isAirBlock((int)posX, (int)posY, (int)posZ) && !worldObj.isAirBlock((int)posX, (int)posY - 1, (int)posZ)) {

                worldObj.setBlock((int)posX, (int)posY, (int)posZ, BlockInfo.BOMB_ID);
                setDead();

            }
        }

        setPosition(posX + motionX, posY + motionY, posZ + motionZ);
    }
}
