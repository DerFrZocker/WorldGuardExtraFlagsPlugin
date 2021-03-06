package net.goldtreeservers.worldguardextraflags.flags.data;

import java.util.concurrent.TimeUnit;

import org.bukkit.Color;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PotionEffectDetails
{
	@Getter private final long endTime;
	@Getter private final int amplifier;
	@Getter private final boolean ambient;
	@Getter private final boolean particles;
	@Getter private final Color color;
	
	public long getTimeLeft()
	{
		return (this.endTime - System.nanoTime());
	}
	
	public int getTimeLeftInTicks()
	{
		return (int)(this.getTimeLeft() / TimeUnit.MILLISECONDS.toNanos(50L));
	}
}
