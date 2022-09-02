package com.services;

import com.documents.Log;
import com.dtos.LogDto;
import com.repositories.LogRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LogServiceImpl implements LogService{

    private final LogRepository logRepository;

    private final ModelMapper mapper;

    @Override
    public List<LogDto> listAll() {
        List<Log> logs = logRepository.findAll();
        return logs.stream().map(e -> mapper.map(e, LogDto.class)).toList();
    }
}
