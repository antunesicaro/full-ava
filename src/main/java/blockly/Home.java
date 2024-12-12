package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Home {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 14/06/2024, 16:34:22
 *
 */
public static Var aoIniciarVerificaTipoDeUsuario() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    // agora só linkar com user logado
    if (
    cronapi.database.Operations.hasElement(
    cronapi.database.Operations.query(Var.valueOf("app.entity.UserRole"),Var.valueOf("select \n	u \nfrom \n	UserRole u  \nwhere \n	u.role.name = :roleName"),Var.valueOf("roleName",
    Var.valueOf("Paciente")))).getObjectAsBoolean()) {
        System.out.println(
        Var.valueOf("entrei com paciente").getObjectAsString());
    }
    if (
    cronapi.database.Operations.hasElement(
    cronapi.database.Operations.query(Var.valueOf("app.entity.UserRole"),Var.valueOf("select \n	u \nfrom \n	UserRole u  \nwhere \n	u.role.name = :roleName"),Var.valueOf("roleName",
    Var.valueOf("Administrators")))).getObjectAsBoolean()) {
        System.out.println(
        Var.valueOf("entrei com admin").getObjectAsString());
    }
    if (
    cronapi.database.Operations.hasElement(
    cronapi.database.Operations.query(Var.valueOf("app.entity.UserRole"),Var.valueOf("select \n	u \nfrom \n	UserRole u  \nwhere \n	u.role.name = :roleName"),Var.valueOf("roleName",
    Var.valueOf("Psicologo")))).getObjectAsBoolean()) {
        System.out.println(
        Var.valueOf("entrei com psicologo").getObjectAsString());
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

