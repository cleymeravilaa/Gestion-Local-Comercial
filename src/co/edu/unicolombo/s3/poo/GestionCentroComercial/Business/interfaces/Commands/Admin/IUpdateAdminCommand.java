
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;

/**
 *
 * @author Daniel
 */
public interface IUpdateAdminCommand {
    public Administrator updateAdmin(int adminId) throws Exception;
}
