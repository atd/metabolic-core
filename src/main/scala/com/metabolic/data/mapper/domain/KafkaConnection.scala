package com.metabolic.data.mapper.domain

case class KafkaConnection(servers: Option[Seq[String]], key: Option[String], secret: Option[String])
