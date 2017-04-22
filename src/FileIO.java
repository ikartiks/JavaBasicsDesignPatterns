import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileIO {

	public static void main(String[] args) {
		
		
		File f=new File("abc.txt");
		if(!f.exists())
		{
			try {
				boolean b=f.createNewFile();
				System.out.println(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		String s="774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n774XP8CLmdaSH8fM1OKl\n";
		final int buffer_size=90;
		
		try {
			
			byte[] bytes=new byte[buffer_size];
			//FileInputStream fis=new FileInputStream(s);
			
			
			ByteArrayInputStream fis=new ByteArrayInputStream(s.getBytes());
			FileOutputStream fos=new FileOutputStream(f);
			for(;;)
            {
              int count=fis.read(bytes, 0, buffer_size);
              if(count==-1)
                  break;
              fos.write(bytes, 0, count);
            }
			
			System.out.println("done");
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
