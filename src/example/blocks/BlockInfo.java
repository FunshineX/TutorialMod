package example.blocks;

/**
 * Created with IntelliJ IDEA.
 * User: ron.douglas
 * Date: 9/15/13
 * Time: 11:24 PM
 */
public class BlockInfo {

    public static final String TEXTURE_LOCATION = "example";

    public static int MACHINE_ID;
    public static final String MACHINE_KEY = "Machine";
    public static final int MACHINE_DEFAULT = 2075;

    public static final String MACHINE_UNLOCALIZED_NAME = "sillyMachine";
    public static final String MACHINE_NAME = "Silly Machine";

    public static final String MACHINE_TOP = "machine_top";
    public static final String MACHINE_BOT = "machine_bottom";
    public static final String[] MACHINE_SIDES = {"machine_side", "machine_side_arrow","machine_side_box","machine_side_cross"};
    public static final String MACHINE_DISABLED = "machine_disabled";


    public static int BOMB_ID;
    public static final String BOMB_KEY = "bomb";
    public static final int BOMB_DEFAULT = 2076;

    public static final String BOMB_UNLOCALIZED_NAME = "weirdBomb";
    public static final String BOMB_NAME = "Weird Bomb";

    public static final String BOMB_TEXTURE = "bomb";
    public static final String BOMB_IDLE_TEXTURE = "bomb_idle";

    public static final String BOMB_TE_KEY = "bombTileEntity";
}
