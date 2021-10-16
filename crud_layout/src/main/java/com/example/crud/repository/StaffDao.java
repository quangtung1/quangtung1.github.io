package com.example.crud.repository;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Optional;

import com.example.crud.model.Staff;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
public class StaffDao extends DAO<Staff> {
    public StaffDao(String csvFile){
            this.readCSV(csvFile);
    }

    @Override
    public void readCSV(String csvFile) {
        try {
            File file = ResourceUtils.getFile("classpath:static/" + csvFile);
            CsvMapper mapper = new CsvMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
            CsvSchema schema = CsvSchema.emptySchema().withHeader().withColumnSeparator('|'); // Dòng đầu tiên sử dụng làm
                                                                                              // Header
            ObjectReader oReader = mapper.readerFor(Staff.class).with(schema); // Cấu hình bộ đọc CSV phù hợp với kiểu
            Reader reader = new FileReader(file);
            MappingIterator<Staff> mi = oReader.readValues(reader); // Iterator đọc từng dòng trong file
            while (mi.hasNext()) {
             Staff staff = mi.next();
              this.add(staff);
            }
          } catch (IOException e) {
            System.out.println(e);
          }
        
    }

    @Override
    public List<Staff> getAll() {
        // TODO Auto-generated method stub
        return list;
    }

    @Override
    public Optional<Staff> get(long id) {
        return list.stream().filter(s->s.getId()==id).findFirst();
    }

    @Override
    public void add(Staff t) {
        long id;
    if (list.isEmpty()) {
      id = 1;
    } else {
      Staff staff = list.get(list.size() - 1);
      id = staff.getId() + 1;      
    }
    t.setId(id);
    list.add(t);
        
    }

    @Override
    public void update(Staff t) {
        get(t.getId()).ifPresent(staff->{
          staff.setFirstName(t.getFirstName());
          staff.setLastName(t.getLastName());
          staff.setEmailId(t.getEmailId());
          staff.setPassportNumber(t.getPassportNumber());
        });
        
    }

    @Override
    public void deleteByID(long id) {
        get(id).ifPresent(staff->list.remove(staff));
        
    }

    @Override
    public void delete(Staff t) {
        // TODO Auto-generated method stub
        deleteByID(t.getId());
    }
    
}
