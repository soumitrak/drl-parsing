package sk.apps

import java.io.File

import com.typesafe.scalalogging.LazyLogging

import org.kie.api.io.ResourceType
import org.kie.internal.io.ResourceFactory
import org.kie.internal.builder.KnowledgeBuilderFactory

object DrlParsing extends LazyLogging {
  def main (args: Array [String]): Unit = {
    logger.info ("Starting KnowledgeBuilder")
    val kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder ()
    args.foreach { fileName =>
      logger.info (s"Adding file $fileName")
      kbuilder.add (ResourceFactory.newFileResource (new File (fileName)), ResourceType.DRL)
    }
    if (kbuilder.hasErrors ())
      logger.error (kbuilder.getErrors ().toString ())
    logger.info ("Done parsing DRL file(s).")
  }
}
