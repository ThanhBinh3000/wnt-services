package vn.com.gsoft.services.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.gsoft.services.entity.NoteServices;
import vn.com.gsoft.services.model.dto.NoteServicesReq;
import vn.com.gsoft.services.repository.NoteServicesRepository;
import vn.com.gsoft.services.service.NoteServicesService;


@Service
@Log4j2
public class NoteServicesServiceImpl extends BaseServiceImpl<NoteServices, NoteServicesReq,Long> implements NoteServicesService {

	private NoteServicesRepository hdrRepo;
	@Autowired
	public NoteServicesServiceImpl(NoteServicesRepository hdrRepo) {
		super(hdrRepo);
		this.hdrRepo = hdrRepo;
	}

}
