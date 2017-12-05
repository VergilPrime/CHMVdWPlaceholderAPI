package me.vergilprime.chmvdwplaceholderapi;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

@MSExtension("MVdWPlaceholderAPI")
public class MyExtension extends AbstractExtension {
    @Override
    public Version getVersion() {
        return new SimpleVersion(0,0,1);
    }

    @Override
    public void onStartup() {

      if(Bukkit.getPluginManager().isPluginEnabled("MVdWPlaceholderAPI")) {
        System.out.println("CHMVdWPlaceholderAPI version " + getVersion() + " loaded.");
      } else {
        System.out.println("CHMVdWPlaceholderAPI version " + getVersion() + " not loaded.");
        System.out.println("MVdWPlaceholderAPI not found.");
      }
    }

    @Override
    public void onShutdown() {
      System.out.println("MVdWPlaceholderAPI version " + getVersion() + " unloaded.");
    }
}
