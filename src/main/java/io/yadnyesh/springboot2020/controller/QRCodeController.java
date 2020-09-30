package io.yadnyesh.springboot2020.controller;

import io.yadnyesh.springboot2020.QRCode.QRCodeGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class QRCodeController {
    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    @GetMapping(value = "gndqrcode/{codeText}/{width}/{height}")
    public void downloadQRCode(@PathVariable("codeText") String codetext,
                               @PathVariable("width") Integer width,
                               @PathVariable("height") Integer height)
    throws Exception{
        QRCodeGenerator.generateQRCodeImage(codetext,width,height,QR_CODE_IMAGE_PATH);
    }

    @GetMapping(value = "genqrcode/{codeText}/{width}/{height}")
    public ResponseEntity<byte[]> generateQRCode(@PathVariable("codeText") String codetext,
                                         @PathVariable("width") Integer width,
                                         @PathVariable("height") Integer height)
            throws Exception{
        return ResponseEntity.status(HttpStatus.OK).body(QRCodeGenerator.getQRCodeImage(codetext,width,height,QR_CODE_IMAGE_PATH));

    }

    @GetMapping("")
    public String  sayHello() {
        return "Hello Yadnyesh!";
    }
}
