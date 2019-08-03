package services

import models.{PagedItems, User}
import skinny.Pagination
import scalikejdbc.{AutoSession, DBSession}

import scala.util.Try

trait UserService {

  def create(user: User)(implicit dbSession: DBSession = AutoSession): Try[Long]

  def findByEmail(email: String)(implicit dbSession: DBSession = AutoSession): Try[Option[User]]

  def findAll(pagination: Pagination)(implicit dbSession: DBSession = AutoSession): Try[PagedItems[User]]

  def findById(id: Long)(implicit dbSession: DBSession = AutoSession): Try[Option[User]]


}