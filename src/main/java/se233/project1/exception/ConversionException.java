package se233.project1.exception;

/** Base checked exception for every recoverable failure in the conversion pipeline. */
/**
 * สรุปหน้าที่ไฟล์: Exception หลักสำหรับข้อผิดพลาดระหว่างกระบวนการแปลงภาพเป็น SVG
 */
public class ConversionException extends Exception {

    public ConversionException(String message) {
        super(message);
    }

    public ConversionException(String message, Throwable cause) {
        super(message, cause);
    }
}
