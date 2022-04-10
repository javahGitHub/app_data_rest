package pdp.uz.app_data_rest.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import pdp.uz.app_data_rest.entity.Attachment;
import pdp.uz.app_data_rest.entity.AttachmentContent;
import pdp.uz.app_data_rest.payload.Result;
import pdp.uz.app_data_rest.repository.AttachmentContentRepo;
import pdp.uz.app_data_rest.repository.AttachmentRepo;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepo attachmentRepository;
    @Autowired
    AttachmentContentRepo attachmentContentRepository;

    //Upload Attachement
    @SneakyThrows
    public Result uploadAttachement(MultipartHttpServletRequest request) {

        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        //Save file info
        Attachment attachment = new Attachment();
        attachment.setName(file.getOriginalFilename());
        attachment.setSize(file.getSize());
        attachment.setContentType(file.getContentType());
        Attachment savedAttachement = attachmentRepository.save(attachment);
        //Save file content
        AttachmentContent attachmentContent = new AttachmentContent();
        attachmentContent.setBytes(file.getBytes());
        attachmentContent.setAttachment(savedAttachement);
        attachmentContentRepository.save(attachmentContent);
        return new Result("File saved successfully", true, savedAttachement.getId());
    }

    //Download Attachement
    public void downloadAttachement(HttpServletResponse response, int id) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findByAttachmentId(id);
            if (optionalAttachmentContent.isPresent()) {
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                response.setHeader("Content-Disposition", "attachment;filename=\"" + attachment.getName() + "\"");
                response.setContentType(attachment.getContentType());

                FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());

            }
        }
    }
}
