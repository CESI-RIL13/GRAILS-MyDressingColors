package mdc

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class SystemController {

	def springSecurityService

    def index() {
    	[
    		pageTitle:"Concept",
    		pageDescription:"Présentation d'un concept intéressant",
    	]
    }

    def facts() {
    	[
    		pageTitle:"Concept",
    		pageDescription:"Présentation d'un concept intéressant",
    	]
    }

    def rules() {
    	[
    		pageTitle:"Concept",
    		pageDescription:"Présentation d'un concept intéressant",
    	]
    }
}
