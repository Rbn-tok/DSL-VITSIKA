package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.vitsika.AtaovyTask
import org.xtext.example.vitsika.Action
import org.xtext.example.vitsika.ClickAction
import org.xtext.example.vitsika.MoveAction
import org.xtext.example.vitsika.WaitAction
import org.xtext.example.vitsika.OpenApplicationAction
import org.xtext.example.vitsika.Maty
import org.xtext.example.vitsika.Surfer
import org.xtext.example.vitsika.WifiCreate
import org.xtext.example.vitsika.Typewrite
import org.xtext.example.vitsika.WordTypingAuto

class VitsikaGenerator extends AbstractGenerator {

	val StringBuilder pythonCode = new StringBuilder

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// Réinitialiser le contenu du StringBuilder à chaque génération
        pythonCode.setLength(0)
		for (element : resource.allContents.toIterable) {
			if (element instanceof AtaovyTask) {
				generate(element as AtaovyTask, fsa)
			}
		}

		// Generate Python code for all actions in the same file
		fsa.generateFile("Vistika.py", pythonCode.toString)
	}

	def generate(AtaovyTask task, IFileSystemAccess2 fsa) {
		// Generate Python code for AtaovyTask
		pythonCode.append('''
# Your Python code for AtaovyTask goes here
''')

		task.actions.forEach [ action |
			if (action instanceof ClickAction) {
				generate(action as ClickAction, fsa)
			} else if (action instanceof MoveAction) {
				generate(action as MoveAction, fsa)
			} else if (action instanceof WaitAction) {
				generate(action as WaitAction, fsa)
			} else if (action instanceof OpenApplicationAction) {
				generate(action as OpenApplicationAction, fsa)
			} else if (action instanceof Maty) {
				generate(action as Maty, fsa)
			} else if (action instanceof Surfer) {
				generate(action as Surfer, fsa)
			} else if (action instanceof WifiCreate) {
				generate(action as WifiCreate, fsa)
			} else if (action instanceof Typewrite) {
				generate(action as Typewrite, fsa)
			} else if (action instanceof WordTypingAuto) {
				generate(action as WordTypingAuto, fsa)
			}
		]
	}

	def generate(ClickAction action, IFileSystemAccess2 fsa) {
		// Generate Python code for ClickAction
		pythonCode.append('''
		
		pyautogui.click()  # Remplacez les coordonnées par celles de la fenêtre Word
		
		
		''')
	}

	def generate(MoveAction action, IFileSystemAccess2 fsa) {
		// Generate Python code for MoveAction
		pythonCode.append('''
	
	''')
	}

	def generate(WaitAction action, IFileSystemAccess2 fsa) {
		// Generate Python code for WaitAction
		pythonCode.append('''
		# Your Python code for WaitAction goes here
		# Attendre un peu «action.duration» 
		time.sleep(«action.duration»)
	''')
	}

	def generate(OpenApplicationAction action, IFileSystemAccess2 fsa) {
    var code = '''
	    # Votre code initial ici...
	    # Chemins vers les exécutables (à adapter selon votre installation)
	    word_path = r"C:\Program Files\Microsoft Office\root\Office16\WINWORD.EXE"
	    excel_path = r"C:\Program Files\Microsoft Office\root\Office16\EXCEL.EXE"
	    vlc_path = r"C:\Program Files\VideoLAN\VLC\vlc.exe"
    '''

    val apps = action.applications
    for (app : apps) {
        // Utilisation de if-else pour chaque élément de la liste
        if(app=="word"){
        	code='''
	     # Ouvrir Word
	     subprocess.Popen([word_path])'''
        }
        else if (app == "excel") {
            // Code exécuté si la condition est vraie pour cet élément
            code += '''
	     # Ouvrir Excel
	     subprocess.Popen([excel_path])
           '''
        } else if (app== "vlc") {
            // Code exécuté si la condition est vraie pour cet élément
            code += '''
		# Ouvrir VLC
		subprocess.Popen([vlc_path])
    	'''
        } else {
            // Code exécuté si la condition est fausse pour cet élément
            code += '''
	     # Autre code à exécuter si aucune condition n'est remplie
            '''
        }
    }

    // Generate Python code for OpenApplicationAction
    pythonCode.append('''
    	«code»
    ''')
}


	def generate(Maty action, IFileSystemAccess2 fsa) {
		// Generate Python code for Maty
		val app=action.proc
		var code=''''''
		
		if(app=="vlc"){
			code='''
		# Your Python code for Maty goes here
		# Fermer VLC
		subprocess.run(["taskkill", "/F", "/IM", "vlc.exe"])
		'''
			
		}else if(app=="excel"){
			code='''
		# Fermer Excel
		subprocess.run(["taskkill", "/F", "/IM", "EXCEL.EXE"])'''
		}else if(app=="word"){
			code='''
		# Fermer Word
		subprocess.run(["taskkill", "/F", "/IM", "WINWORD.EXE"])'''
		}
		pythonCode.append('''
		# Your Python code for Maty goes here
		«code»
		
	''')
	}

	def generate(Surfer action, IFileSystemAccess2 fsa) {
		// Generate Python code for Surfer
		pythonCode.append('''
		import webbrowser
		
		def open_default_browser(url):
		    webbrowser.open(url)
		
		# Exemple d'utilisation
		url_to_open = "«action.url»"
		open_default_browser(url_to_open)
''')
	}

	def generate(WifiCreate action, IFileSystemAccess2 fsa) {
		// Generate Python code for WifiCreate
		pythonCode.append('''
		# Your Python code for WifiCreate goes here
''')
	}

	def generate(Typewrite action, IFileSystemAccess2 fsa) {
		// Generate Python code for Typewrite
		pythonCode.append('''
		# Your Python code for Typewrite goes here
''')
	}

	def generate(WordTypingAuto action, IFileSystemAccess2 fsa) {
		// Generate Python code for WordTypingAuto
		pythonCode.append('''
		import time
		import pyautogui
		import subprocess
		
		# Ouvrir Microsoft Word 2019
		subprocess.Popen(["C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE"])
		
		# Attendre quelques secondes pour que Word se charge
		time.sleep(5)
		
		# Ajouter un délai supplémentaire avant de commencer la saisie
		
		# Par exemple, appuyer sur la touche Entrée
		pyautogui.press("enter")
		
		# Effectuer des saisies en utilisant PyAutoGUI avec un intervalle entre les caractères
		text="«action.teny»"
		pyautogui.typewrite(text, interval=0.05)  # Ajustez l'intervalle selon vos besoins
		
		# Par exemple, appuyer sur la touche Entrée
		pyautogui.press("enter")
		
		# Vous pouvez également effectuer d'autres actions, comme déplacer la souris
		pyautogui.moveTo(500, 500)
		
		# Attendre quelques secondes pour voir le résultat
		time.sleep(5)
		
		# Fermer Word (cela dépend du système d'exploitation, vous devrez peut-être ajuster cela)
		# Dans ce cas, on suppose que la fenêtre de Word est active
		# pyautogui.hotkey('alt', 'f4')
		

		''')
	}
}
