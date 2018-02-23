package fr.circus.celestart.Tool;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class StarModHammer extends ItemPickaxe {
	
	public StarModHammer(ToolMaterial material) {
		super(material);
	}

	public RayTraceResult rayTrace(double blockReachDistance, float partialTicks, World w, EntityLivingBase e)
    {
        Vec3d vec3d = e.getPositionEyes(partialTicks);
        Vec3d vec3d1 = e.getLook(partialTicks);
        Vec3d vec3d2 = vec3d.addVector(vec3d1.x * blockReachDistance, vec3d1.y * blockReachDistance, vec3d1.z * blockReachDistance);
        return w.rayTraceBlocks(vec3d, vec3d2, false, false, true);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack breaker, World w, IBlockState state, BlockPos pos, EntityLivingBase e)
    {
        if (e instanceof EntityPlayer && !w.isRemote)
        {
            EntityPlayer p = (EntityPlayer) e;
            RayTraceResult r = this.rayTrace(5.0D, 0.0F, w, e);

            if (r.typeOfHit == RayTraceResult.Type.BLOCK)
            {
                int x = pos.getX();
                int y = pos.getY();
                int z = pos.getZ();

                EnumFacing side = r.sideHit;

                // Y
                // UP - DOWN
                if (side == EnumFacing.DOWN || side == EnumFacing.UP)
                {
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z - 1);
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z);
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z + 1);

                    this.destroyAndDropBlock(w, p, breaker, x, y, z - 1);
                    // Middle block
                    this.destroyAndDropBlock(w, p, breaker, x, y, z + 1);

                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z - 1);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z + 1);
                }

                // Z
                // NORTH - SOUTH
                else if (side == EnumFacing.NORTH || side == EnumFacing.SOUTH)
                {
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y + 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y + 1, z);

                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z);
                    // Middle block
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z);

                    this.destroyAndDropBlock(w, p, breaker, x + 1, y - 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y - 1, z);
                }

                // X
                // EAST - WEST
                else if (side == EnumFacing.EAST || side == EnumFacing.WEST)
                {
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z + 1);
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z - 1);

                    this.destroyAndDropBlock(w, p, breaker, x, y, z + 1);
                    // Middle block
                    this.destroyAndDropBlock(w, p, breaker, x, y, z - 1);

                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z + 1);
                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z - 1);
                }

                return true;
            }
        }

        return super.onBlockDestroyed(breaker, w, state, pos, e);
    }

    private void destroyAndDropBlock(World w, EntityPlayer p, ItemStack breaker, int x, int y, int z)
    {
        BlockPos pos = new BlockPos(x, y, z);
        w.getBlockState(pos).getBlock().harvestBlock(w, p, pos, w.getBlockState(pos), w.getTileEntity(pos), breaker);
        w.setBlockToAir(pos);
    }
}