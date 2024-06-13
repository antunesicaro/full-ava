package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AgendaTeste {

public static final int TIMEOUT = 300;

/**
 *
 * @param Consulta a Entidades<app.entity.Agendamento>
 *
 * @author Ícaro Antunes
 * @since 13/06/2024, 02:14:45
 *
 */
public static Var antesDeinserir(@ParamMetaData(description = "Consulta_a_Entidades", id = "4f9506e1") Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.updateField(Consulta_a_Entidades,
    Var.valueOf("usuario"),
    cronapi.conversion.Operations.toString(
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.id \nfrom \n	User u  \nwhere \n	u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
    cronapi.text.Operations.normalize(
    cronapi.util.Operations.getCurrentUserName())))))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Consulta a Entidades<app.entity.Agendamento>
 *
 * @author Ícaro Antunes
 * @since 13/06/2024, 02:14:45
 *
 */
public static Var depoisDeInserir(@ParamMetaData(description = "Consulta_a_Entidades", id = "4f9506e1") Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Agendamento"), Var.valueOf("update \n	Agendamento  \nset \n	user = :user \nwhere \n	id = :id"),Var.valueOf("user",
    cronapi.util.Operations.getCurrentUserName()),Var.valueOf("id",
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("id"))));
    System.out.println(
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("id")).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

