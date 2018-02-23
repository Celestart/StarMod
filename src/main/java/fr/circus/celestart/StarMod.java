package fr.circus.celestart;

import org.apache.logging.log4j.Logger;

import fr.circus.celestart.Events.RegisteringHandler;
import fr.circus.celestart.Proxy.CommonProxy;
import fr.circus.celestart.Tabs.TabStarMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class StarMod {

   public static final String MODID = "starmod";
   
	@Mod.Instance(Reference.MOD_ID)
   public static StarMod instance;
   
@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
   public static CommonProxy proxy;
   
   public static Logger logger;
   
   public static CreativeTabs TabStarMod = new TabStarMod("TabStarMod");
   
   public StarMod() {
	    MinecraftForge.EVENT_BUS.register(new RegisteringHandler());
	}
   
   @EventHandler
   public void preInit(FMLPreInitializationEvent event)
   {
       logger = event.getModLog();
       
       proxy.preInit(event.getSuggestedConfigurationFile());
   }
   
   @EventHandler
   public void init(FMLInitializationEvent event)
   {
	   proxy.init();
   }
}
