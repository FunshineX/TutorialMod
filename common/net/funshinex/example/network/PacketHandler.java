package net.funshinex.example.network;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.funshinex.example.ModInformation;
import net.funshinex.example.entities.EntitySpaceship;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/15/13
 * Time: 4:38 PM
 */
public class PacketHandler implements IPacketHandler {

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
        ByteArrayDataInput reader = ByteStreams.newDataInput(packet.data);

        int entityID = reader.readInt();

        EntityPlayer entityPlayer = (EntityPlayer)player;
        Entity entity = entityPlayer.worldObj.getEntityByID(entityID);

        if (entity != null && entity instanceof EntitySpaceship && entity.riddenByEntity == entityPlayer) {
            ((EntitySpaceship)entity).doDrop();
        }
    }

    public static void sendShipPacket(EntitySpaceship ship) {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        DataOutputStream dataStream = new DataOutputStream(byteStream);

        try {
            dataStream.writeInt(ship.entityId);

            PacketDispatcher.sendPacketToServer(PacketDispatcher.getPacket(ModInformation.CHANNEL, byteStream.toByteArray()));
        }
        catch(IOException ex) {
            System.err.append("Failed to send spaceship drop packet");
        }
    }
}
