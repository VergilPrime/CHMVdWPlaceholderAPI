import be.maximvdw.placeholderapi.PlaceholderAPI;
import be.maximvdw.placeholderapi.PlaceholderReplacer;
import be.maximvdw.placeholderapi.PlaceholderReplaceEvent;

public class FunctionGroup {
    public static String docs() {
        return "Functions for using MVdWPlaceholderAPI.";
    }

    @api
    public static class set_mvdwplaceholders extends AbstractFunction {
      Player p = null;
      if(!args[0] instanceof CNull) {
        Player p = Static.GetPlayer(args[0].val(), t).getHandle();
      }
      return new CString(PlaceholderAPI.replacePlaceholders(p, args[1].val()), t)
    }
}
