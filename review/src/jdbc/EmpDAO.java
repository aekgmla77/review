package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 *  VO: Value Object (값을 저장하는 객체)  ==  EmpDTO, EmpDO, Emp
 *  DAO: Data Access Object
 */
public class EmpDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public EmpVO selectOne(String id) {
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT    EMPLOYEE_ID,"
								+ " FIRST_NAME,"
								+ " LAST_NAME,"
								+ " EMAIL,"
								+ " PHONE_NUMBER,"
								+ " HIRE_DATE,"
								+ " JOB_ID,"
								+ " SALARY,"
								+ " COMMISSION_PCT,"
								+ " MANAGER_ID,"
								+ " DEPARTMENT_ID "
								+ " FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new EmpVO();
				vo.setDepartment_id(rs.getString("employee_id"));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhone_number(rs.getString("phone_number"));
				vo.setHire_date(rs.getString("hire_date"));
				vo.setJob_id(rs.getString("job_id"));
				vo.setSalary(rs.getString("salary"));
				vo.setCommission_pct(rs.getString("commission_pct"));
				vo.setManager_id(rs.getString("manager_id"));
				vo.setDepartment_id(rs.getString("department_id"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.disconnect(conn);
		}
		return vo;
	}
	
	public List<EmpVO> selectList() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT    EMPLOYEE_ID,"
								+ " FIRST_NAME,"
								+ " LAST_NAME,"
								+ " EMAIL,"
								+ " PHONE_NUMBER,"
								+ " HIRE_DATE,"
								+ " JOB_ID,"
								+ " SALARY,"
								+ " COMMISSION_PCT,"
								+ " MANAGER_ID,"
								+ " DEPARTMENT_ID"
								+ " FROM EMPLOYEES "
								+ " ORDER BY EMPLOYEE_ID";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new EmpVO();
				vo.setDepartment_id(rs.getString("employee_id"));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhone_number(rs.getString("phone_number"));
				vo.setHire_date(rs.getString("hire_date"));
				vo.setJob_id(rs.getString("job_id"));
				vo.setSalary(rs.getString("salary"));
				vo.setCommission_pct(rs.getString("commission_pct"));
				vo.setManager_id(rs.getString("manager_id"));
				vo.setDepartment_id(rs.getString("department_id"));
				list.add(vo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.disconnect(conn);
		}
		return list;
	}
	
	public void insert(EmpVO vo) {
		try {
			// 1. connect
			JdbcUtil.connect();
			// 2. statement(SQL 구문)
			String sql = "INSERT INTO EMPLOYEES (EMPLOYEE_ID,"
								+ "LAST_NAME,"
								+ "EMAIL,"
								+ "HIRE_DATE,"
								+ "JOB_ID) "
								+ "VALUES(?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// 3. execute(실행)
			pstmt.setString(1, vo.getEmployee_id());
			pstmt.setString(2, vo.getLast_name());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getHire_date());
			pstmt.setString(5, vo.getJob_id());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 등록되었습니다.");
			// 4. resultSet(select라면 조회 결과)
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 5. close(연결 해제)
			JdbcUtil.disconnect(conn);
		}
	}
	
	public void update(EmpVO vo) {
		try {
			// 1. connect
			JdbcUtil.connect();
			
			// 2. statement(SQL 구문)
			
			// 3. execute(실행)
			
			// 4. resultSet(select라면 조회 결과)
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 5. close(연결 해제)
			JdbcUtil.disconnect(conn);
		}
	}
}
