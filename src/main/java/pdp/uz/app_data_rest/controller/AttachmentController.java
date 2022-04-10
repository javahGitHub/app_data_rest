package pdp.uz.app_data_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import pdp.uz.app_data_rest.payload.Result;
import pdp.uz.app_data_rest.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;


    //Upload Attachement
    @PostMapping("/upload")
    public Result uploadController(MultipartHttpServletRequest request) {
        Result result = attachmentService.uploadAttachement(request);
        return result;
    }

    //Download Attachement
    @GetMapping("/download/{id}")
    public void uploadController(HttpServletResponse response, @PathVariable Integer id) throws IOException {
        attachmentService.downloadAttachement(response, id);
    }
}
