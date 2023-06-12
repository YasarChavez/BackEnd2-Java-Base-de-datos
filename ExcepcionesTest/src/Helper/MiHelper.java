package Helper;

import CustomException.CustomException;

public class MiHelper {
    public MiHelper() {

    }

    public void validarPassword(String password,String confirmPassword) throws CustomException {
        if (!password.equals(confirmPassword)) {
            throw new CustomException("Las contraseñas no coinciden");
        }
        if (password.length() < 8) {
            throw new CustomException("La contraseña debe tener al menos 8 caracteres");
        }
    }

    public void validarUsuario(String usuario) throws CustomException {
        if (usuario.isEmpty()){
            throw new CustomException("El usuario no puede estar vacio!");
        }
        if (usuario.length()<6){
            throw new CustomException("El usuario debe tener al menos 6 caracteres");
        }
    }
}
