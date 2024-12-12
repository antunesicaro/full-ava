package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class User {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 04/01/2024, 10:34:05
 *
 */
public static Var getUserLoggedId() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.list.Operations.getFirst((
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.id \nfrom \n	User u  \nwhere \n	u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
cronapi.text.Operations.normalize(
cronapi.util.Operations.getCurrentUserName())))));
   }
 }.call();
}

/**
 *
 * @author Ícaro Antunes
 * @since 04/01/2024, 10:34:05
 *
 */
public static Var getUserLoggedId2() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.list.Operations.getFirst((
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.normalizedUserName \nfrom \n	User u  \nwhere \n	u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
cronapi.text.Operations.normalize(
cronapi.util.Operations.getCurrentUserName())))));
   }
 }.call();
}

}

