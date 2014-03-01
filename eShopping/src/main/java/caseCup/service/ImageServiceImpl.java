package caseCup.service;


import caseCup.dao.ImageDAO;
import caseCup.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/10/13
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageDAO imageDAO;
    @Override
    @Transactional
    public Image get(Integer id) {
        return imageDAO.get(id);
    }
}
