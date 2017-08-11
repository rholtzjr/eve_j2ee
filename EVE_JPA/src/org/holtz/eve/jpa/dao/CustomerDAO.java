package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.S01CuCust;
import org.holtz.eve.jpa.entity.TCuCust;
import org.holtz.eve.jpa.entity.TEmEmp;

public interface CustomerDAO {

	public TCuCust getCustDataByUserName(String userName);
	public TCuCust getCustDataByUserId(int id);
	public List<TCuCust> getCustList();
	public List<TEmEmp> getEmpList();
	public TEmEmp getEmployeeDataByUserId(int id);
	public TEmEmp getEmployeeDataByName(String userName);
	public void save(TCuCust customer);
    public void save(TEmEmp employee);
    public void delete(TCuCust customer);
    public void delete(TEmEmp employee);
    
}
