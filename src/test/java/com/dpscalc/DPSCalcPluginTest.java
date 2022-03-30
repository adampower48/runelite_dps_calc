package com.dpscalc;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DPSCalcPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DPSCalcPlugin.class);
		RuneLite.main(args);
	}
}