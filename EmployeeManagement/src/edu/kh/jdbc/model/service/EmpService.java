package edu.kh.jdbc.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.model.dao.EmpDAO;
import edu.kh.jdbc.model.dto.Emp;

public class EmpService {

	private EmpDAO dao = new EmpDAO();
	
	
	/** 재직 중인 사원 정보 반환 서비스
	 * @return
	 * @throws SQLException
	 */
	public List<Emp> selectCurrentEmployee() throws SQLException{
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectCurrentEmployee(conn);
		
		close(conn);
		
		return empList;
		
	}


	/** 퇴직한 사원 정보 반환 서비스
	 * @return
	 * @throws SQLException
	 */
	public List<Emp> selectRetireEmployee() throws SQLException {
		
		Connection conn = getConnection(); // 커넥션 생성
		
		List<Emp> empList = dao.selectRetireEmployee(conn); // dao 호출
		
		close(conn);
		
		return empList;
		
	}


	/** 사번이 일치하는 사원 정보 반환 서비스
	 * @param input
	 * @throws SQLException
	 */
	public Emp selectOne(int input) throws SQLException{
		
		Connection conn = getConnection();

		Emp emp = dao.selectOne(conn, input);

		close(conn);

		return emp;
		
	};
	
	/** 사번이 일치하는 사원 정보 반환 서비스
	 * @param input
	 * @throws SQLException
	 */
	public int updateEmployee(Emp emp) throws SQLException{
		
		Connection conn = getConnection();
		
		int result = dao.updateEmployee(conn, emp);
		
		if(result>0) commit(conn);
		else		 rollback(conn);
		
		close(conn);
		
		return result;
		
	}


	/** 존재하는 사원인지, 퇴직한 사원인지 결과를 반환하는 서비스
	 * @param input
	 * @return check (0: 없는 사원, 1: 퇴직한 사원, 2: 재직 중인 사원)
	 * @throws SQLException
	 */
	public int checkEmployee(int input) throws SQLException {
		
		Connection conn = getConnection();
		
		int check = dao.checkEmployee(conn, input);
		
		close(conn);
		
		return check;
		
	}


	/** 퇴직 처리 서비스
	 * @param input
	 * @throws SQLException
	 */
	public void retireEmployee(int input) throws SQLException {
		
		Connection conn = getConnection();
		
		dao.retireEmployee(conn,input); // 성공 또는 예외
		
		// 트랜잭션 처리
		// 예외 발생 시 SQL 수행이 정상적으로 진행되지 않음
		commit(conn);
		rollback(conn);
		
		close(conn);
		
	}


	/** 부서별 통계 조회 서비스
	 * @return mapList
	 * @throws SQLException
	 */
	public List<Map<String, Object>> selectDepartment() throws SQLException {
		
		Connection conn = getConnection();
		
		List<Map<String, Object>> mapList = dao.selectDepartment(conn);
		
		close(conn);
		
		return mapList;
	};
	
	
}
