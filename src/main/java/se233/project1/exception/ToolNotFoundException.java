package se233.project1.exception;

/** Thrown when the external tracing CLI (Potrace) cannot be located or started. */
/**
 * สรุปหน้าที่ไฟล์: Exception สำหรับกรณีไม่พบเครื่องมือภายนอก เช่น Potrace
 */
public class ToolNotFoundException extends ConversionException {

    public ToolNotFoundException(String message) {
        super(message);
    }

    public ToolNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
