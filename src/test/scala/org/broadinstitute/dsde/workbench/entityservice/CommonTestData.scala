package org.broadinstitute.dsde.workbench.entityservice

import java.time.Instant
import java.util.UUID

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._
import org.broadinstitute.dsde.workbench.model.{UserInfo, WorkbenchEmail, WorkbenchUserId}
import org.scalatest.concurrent.ScalaFutures

import scala.concurrent.ExecutionContext

// values common to multiple tests, to reduce boilerplate

trait CommonTestData { this: ScalaFutures =>

  //val entity1 = ...

}


