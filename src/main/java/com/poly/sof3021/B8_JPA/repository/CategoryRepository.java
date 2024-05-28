package com.poly.sof3021.B8_JPA.repository;

import com.poly.sof3021.B8_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category1,Long> {
    // JPARepository
    // CRUDRepository
    // CRUD vs 1 bang k can phai viet

    // C1: Query creation
//    List<Category1> findCategory1sById1AndCategoryName(String categoryName, Long id);
    // C2: Raw SQL
        // C1: JPQL(JPA Query Lanugage) => Truy van tren thuc the
//    @Query("SELECT  c FROM Category1 c WHERE c.id1 = ?2 AND c.categoryCode1 = ?1")
//    List<Category1>search(String code, Long id);
//    @Query("SELECT  c FROM Category1 c WHERE c.id1 =:id111 AND c.categoryCode1 =:code123")
//    List<Category1>search(@Param("id111") Long id, @Param("code123")String code);
        // C2: native query
//    @Query(value = " SELECT * FROM category ",nativeQuery = true)
//    List<Category1>search1(@Param("id111") Long id, @Param("code123")String code);

}
