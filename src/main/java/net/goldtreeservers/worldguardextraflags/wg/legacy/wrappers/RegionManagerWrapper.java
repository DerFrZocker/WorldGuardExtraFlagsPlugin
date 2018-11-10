package net.goldtreeservers.worldguardextraflags.wg.legacy.wrappers;

import java.util.Map;

import org.bukkit.Location;

import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.math.Vector3;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.ProtectedCuboidRegion;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class RegionManagerWrapper
{
	protected final RegionManager regionManager;

	public ProtectedRegion getRegion(String id)
	{
		return this.regionManager.getRegion(id);
	}

	public ApplicableRegionSet getApplicableRegions(Vector3 location)
	{
		return this.regionManager.getApplicableRegions(location.toBlockPoint());
	}

	public ApplicableRegionSet getApplicableRegions(Location location)
	{
		return this.getApplicableRegions(Vector3.at(location.getX(), location.getY(),location.getZ()));
	}

	public ApplicableRegionSet  getApplicableRegions(ProtectedCuboidRegion protectedCuboidRegion)
	{
		return this.regionManager.getApplicableRegions(protectedCuboidRegion);
	}

	public Map<String, ProtectedRegion> getRegions()
	{
		return this.regionManager.getRegions();
	}
}
