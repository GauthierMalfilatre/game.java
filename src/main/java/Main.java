import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;

public class Main implements ApplicationListener
{
    Texture m_backTexture;

    public static void main(String[] args) {
        System.out.println("Game start!");
    }

    @Override
    public void create() {
        m_backTexture = new Texture("resources/background.png");
    }

    @Override 
    public void dispose()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void pause()
    {

    }

    @Override
    public void render()
    {

    }

    @Override
    public void resize(int w, int h)
    {

    }
}
