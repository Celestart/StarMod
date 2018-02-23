package fr.circus.celestart.Proxy;

import java.io.File;

import fr.circus.celestart.StarModItems;
import fr.circus.celestart.Gui.GuiCustomInGameMenu;
//import fr.circus.celestart.StarModItems;
import fr.circus.celestart.Gui.GuiCustomMainMenu;
import fr.circus.celestart.Gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {
	 
	@Override
    public void preInit(File configFile) {
        super.preInit(configFile);
    }

	public ClientProxy() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
    @Override
    public void init() {
        super.init();
    }
    
    @SubscribeEvent
    public void onOpenGui(GuiOpenEvent event) {
    	if(event.getGui() != null && event.getGui().getClass() == GuiMainMenu.class)
    	{
    		event.setGui(new GuiCustomMainMenu());
    	}
    	
    	if(event.getGui() != null && event.getGui().getClass() == GuiMultiplayer.class)
    	{
    		event.setGui(new GuiCustomMainMenu());
    	}
    	
    	if(event.getGui() != null && event.getGui().getClass() == GuiIngameMenu.class)
    	{
    		event.setGui(new GuiCustomInGameMenu());
    	}
    	if(event.getGui() != null && event.getGui().getClass() == GuiIngameMenu.class)
    	{
    		event.setGui(new GuiCustomInGameMenu());
    	}
	}
    
    
}