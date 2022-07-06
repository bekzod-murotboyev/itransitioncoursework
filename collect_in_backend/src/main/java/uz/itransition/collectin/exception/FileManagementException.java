package uz.itransition.collectin.exception;

public class FileManagementException extends ApiException{

    private static final String FILE_UPLOAD_ERROR_ENG = "File upload error";
    private static final String FILE_UPLOAD_ERROR_RUS = "Ошибка загрузки файла";

    private static final String FILE_DELETION_ERROR_ENG = "File could not deleted";
    private static final String FILE_DELETION_ERROR_RUS = "Не удалось удалить файл";

    private FileManagementException(String messageENG, String messageRUS) {
        super(messageENG, messageRUS);
    }

    public static FileManagementException upload(){
        return new FileManagementException(FILE_UPLOAD_ERROR_ENG, FILE_UPLOAD_ERROR_RUS);
    }

    public static FileManagementException deletion(){
        return new FileManagementException(FILE_DELETION_ERROR_ENG,FILE_DELETION_ERROR_RUS);
    }




}
