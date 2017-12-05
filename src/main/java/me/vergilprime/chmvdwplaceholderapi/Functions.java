package me.vergilprime.chmvdwplaceholderapi;

import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.Static;
import com.laytonsmith.core.constructs.CClosure;
import com.laytonsmith.core.constructs.CNull;
import com.laytonsmith.core.constructs.CString;
import com.laytonsmith.core.constructs.CVoid;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.exceptions.CRE.CREFormatException;
import com.laytonsmith.core.exceptions.CRE.CREPlayerOfflineException;
import com.laytonsmith.core.exceptions.CRE.CREThrowable;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.functions.AbstractFunction;
import org.bukkit.entity.Player;
import be.maximvdw.placeholderapi.PlaceholderAPI;
import be.maximvdw.placeholderapi.PlaceholderReplacer;
import be.maximvdw.placeholderapi.PlaceholderReplaceEvent;

public class FunctionGroup {
  public static String docs() {
      return "Functions for using MVdWPlaceholderAPI.";
  }

  @api
  public static class set_mvdwplaceholders extends AbstractFunction {

		public Class<? extends CREThrowable>[] thrown() {
			return new Class[]{CREPlayerOfflineException.class};
		}

		public boolean isRestricted() {
			return true;
		}

		public Boolean runAsync() {
			return false;
		}

    public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
      Player p = null;
      if(!args[0] instanceof CNull) {
        Player p = Static.GetPlayer(args[0].val(), t).getHandle();
      }
      return new CString(PlaceholderAPI.replacePlaceholders(p, args[1].val()), t)
    }
  }
}
