import java.awt.*;  
public class AWTProgram11{  
  public AWTProgram11(){  
    Frame f = new Frame();
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);

        MenuBar mb=new MenuBar();

        Menu menu=new Menu("COSMOTICS");  


        Menu subMenu=new Menu("SOAPS");  

		MenuItem i1=new MenuItem("PERFUMES");  
		MenuItem i2=new MenuItem("POWEDERS");  
		MenuItem i3=new MenuItem("LIPSTICKS");  
		MenuItem i4=new MenuItem("LUX");  
		MenuItem i5=new MenuItem("REXONA");  

		menu.add(i1);
		menu.add(i2);
		menu.add(i3);

		subMenu.add(i4);
		subMenu.add(i5);

	   menu.add(subMenu);
	   mb.add(menu);
     f.setMenuBar(mb);

  }  
  
  public static void main(String args[])  
  {  
    new AWTProgram11();  
  }  
}  