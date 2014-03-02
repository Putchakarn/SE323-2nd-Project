package cbsd.lab11.controller;

import cbsd.lab11.entity.Image;
import cbsd.lab11.entity.Product;
import cbsd.lab11.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 1/30/13
 * Time: 7:25 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("product")
@SessionAttributes({"userSession"})
public class ProductController {


    @Autowired
    ProductService productService;

    @RequestMapping("addProduct")
     public String callRegistPage(Model model){
        model.addAttribute("product",new Product());
        return "addProduct1";
    }


    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("products", productService.getProducts());
        return "product/product";
    }

    @RequestMapping(value = "addValidProduct",method = RequestMethod.POST)
    public String addValidLecturer(@Valid Product product, BindingResult bindingResult,Model model
            ,@RequestParam("file")MultipartFile file){
        if (bindingResult.hasErrors()){
            return "addProduct1";
        }
        // add image object
        try {
            Image image = new Image();
            image.setFilename(file.getName());
            image.setContentType(file.getContentType());
            image.setContent(file.getBytes());
            product.setImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // image object add
        productService.addProduct(product);
        return "redirect:/lecturer/list";
    }

//    @RequestMapping("addLecturer")
//    public String addLecturer(@ModelAttribute Admin lecturer, BindingResult bindingResult,Model model){
//        lecturerService.addLecturer(lecturer);
//        return "redirect:/lecturer/list";
//    }
//
//
//

//
//    @RequestMapping(value = "update/{id}")
//    public String updateLecturer(@PathVariable("id") Integer id, Model model){
//        Admin lecturer = lecturerService.findByID(id);
//        model.addAttribute("lecturer",lecturer);
//
//        return "lecturerRegist";
//    }
//
//    @Autowired
//    ImageService imageService;
//
//    @RequestMapping(value = "image/{id}")
//    public String showImage(@PathVariable("id") Integer id, Model model,
//                            HttpServletResponse response){
//
//        try {
//            Image  image = imageService.get(id);
//            if (image != null){
//                OutputStream out = response.getOutputStream();
//                response.setContentType(image.getContentType());
//                //IOUtils.copy(new ByteArrayInputStream(image.getContent()),out);
//                ByteArrayInputStream bis = new ByteArrayInputStream(image.getContent());
//                ImageIO.setUseCache(false);
//                BufferedImage myImage = ImageIO.read(bis);
//                int rectangleSize = 300;
//                BufferedImage bi = Scalr.resize(myImage,rectangleSize);
//                ImageIO.write(bi,getContentType(image.getContentType()),out);
//                out.flush();
//                out.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//
//    }
//
//    private String getContentType(String contentType){
//        if (contentType.contains("jpg")){
//            return "jpg";
//        }else if (contentType.contains("png")){
//            return "png";
//        }else if (contentType.contains("gif")){
//            return "gif";
//        }else{
//            return "jpg";
//        }
//
//    }



}
