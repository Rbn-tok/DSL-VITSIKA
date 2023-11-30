package org.xtext.example.generator;

import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.vitsika.Action;
import org.xtext.example.vitsika.AtaovyTask;
import org.xtext.example.vitsika.ClickAction;
import org.xtext.example.vitsika.Maty;
import org.xtext.example.vitsika.MoveAction;
import org.xtext.example.vitsika.OpenApplicationAction;
import org.xtext.example.vitsika.Surfer;
import org.xtext.example.vitsika.Typewrite;
import org.xtext.example.vitsika.WaitAction;
import org.xtext.example.vitsika.WifiCreate;
import org.xtext.example.vitsika.WordTypingAuto;

@SuppressWarnings("all")
public class VitsikaGenerator extends AbstractGenerator {
  private final StringBuilder pythonCode = new StringBuilder();

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.pythonCode.setLength(0);
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(resource.getAllContents());
    for (final EObject element : _iterable) {
      if ((element instanceof AtaovyTask)) {
        this.generate(((AtaovyTask) element), fsa);
      }
    }
    fsa.generateFile("Vistika.py", this.pythonCode.toString());
  }

  public void generate(final AtaovyTask task, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Your Python code for AtaovyTask goes here");
    _builder.newLine();
    this.pythonCode.append(_builder);
    final Consumer<Action> _function = (Action action) -> {
      if ((action instanceof ClickAction)) {
        this.generate(((ClickAction) action), fsa);
      } else {
        if ((action instanceof MoveAction)) {
          this.generate(((MoveAction) action), fsa);
        } else {
          if ((action instanceof WaitAction)) {
            this.generate(((WaitAction) action), fsa);
          } else {
            if ((action instanceof OpenApplicationAction)) {
              this.generate(((OpenApplicationAction) action), fsa);
            } else {
              if ((action instanceof Maty)) {
                this.generate(((Maty) action), fsa);
              } else {
                if ((action instanceof Surfer)) {
                  this.generate(((Surfer) action), fsa);
                } else {
                  if ((action instanceof WifiCreate)) {
                    this.generate(((WifiCreate) action), fsa);
                  } else {
                    if ((action instanceof Typewrite)) {
                      this.generate(((Typewrite) action), fsa);
                    } else {
                      if ((action instanceof WordTypingAuto)) {
                        this.generate(((WordTypingAuto) action), fsa);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    };
    task.getActions().forEach(_function);
  }

  public StringBuilder generate(final ClickAction action, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("pyautogui.click()  # Remplacez les coordonnées par celles de la fenêtre Word");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return this.pythonCode.append(_builder);
  }

  public StringBuilder generate(final MoveAction action, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return this.pythonCode.append(_builder);
  }

  public StringBuilder generate(final WaitAction action, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Your Python code for WaitAction goes here");
    _builder.newLine();
    _builder.append("# Attendre un peu ");
    int _duration = action.getDuration();
    _builder.append(_duration);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("time.sleep(");
    int _duration_1 = action.getDuration();
    _builder.append(_duration_1);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return this.pythonCode.append(_builder);
  }

  public StringBuilder generate(final OpenApplicationAction action, final IFileSystemAccess2 fsa) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# Votre code initial ici...");
      _builder.newLine();
      _builder.append("# Chemins vers les exécutables (à adapter selon votre installation)");
      _builder.newLine();
      _builder.append("word_path = r\"C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE\"");
      _builder.newLine();
      _builder.append("excel_path = r\"C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE\"");
      _builder.newLine();
      _builder.append("vlc_path = r\"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\"");
      _builder.newLine();
      String code = _builder.toString();
      final EList<String> apps = action.getApplications();
      for (final String app : apps) {
        boolean _equals = Objects.equal(app, "word");
        if (_equals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("# Ouvrir Word");
          _builder_1.newLine();
          _builder_1.append("subprocess.Popen([word_path])");
          code = _builder_1.toString();
        } else {
          boolean _equals_1 = Objects.equal(app, "excel");
          if (_equals_1) {
            String _code = code;
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("# Ouvrir Excel");
            _builder_2.newLine();
            _builder_2.append("subprocess.Popen([excel_path])");
            _builder_2.newLine();
            code = (_code + _builder_2);
          } else {
            boolean _equals_2 = Objects.equal(app, "vlc");
            if (_equals_2) {
              String _code_1 = code;
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("# Ouvrir VLC");
              _builder_3.newLine();
              _builder_3.append("subprocess.Popen([vlc_path])");
              _builder_3.newLine();
              code = (_code_1 + _builder_3);
            } else {
              String _code_2 = code;
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("# Autre code à exécuter si aucune condition n\'est remplie");
              _builder_4.newLine();
              code = (_code_2 + _builder_4);
            }
          }
        }
      }
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append(code);
      _builder_5.newLineIfNotEmpty();
      _xblockexpression = this.pythonCode.append(_builder_5);
    }
    return _xblockexpression;
  }

  public StringBuilder generate(final Maty action, final IFileSystemAccess2 fsa) {
    StringBuilder _xblockexpression = null;
    {
      final String app = action.getProc();
      StringConcatenation _builder = new StringConcatenation();
      String code = _builder.toString();
      boolean _equals = Objects.equal(app, "vlc");
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("# Your Python code for Maty goes here");
        _builder_1.newLine();
        _builder_1.append("# Fermer VLC");
        _builder_1.newLine();
        _builder_1.append("subprocess.run([\"taskkill\", \"/F\", \"/IM\", \"vlc.exe\"])");
        _builder_1.newLine();
        code = _builder_1.toString();
      } else {
        boolean _equals_1 = Objects.equal(app, "excel");
        if (_equals_1) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("# Fermer Excel");
          _builder_2.newLine();
          _builder_2.append("subprocess.run([\"taskkill\", \"/F\", \"/IM\", \"EXCEL.EXE\"])");
          code = _builder_2.toString();
        } else {
          boolean _equals_2 = Objects.equal(app, "word");
          if (_equals_2) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("# Fermer Word");
            _builder_3.newLine();
            _builder_3.append("subprocess.run([\"taskkill\", \"/F\", \"/IM\", \"WINWORD.EXE\"])");
            code = _builder_3.toString();
          }
        }
      }
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("# Your Python code for Maty goes here");
      _builder_4.newLine();
      _builder_4.append(code);
      _builder_4.newLineIfNotEmpty();
      _builder_4.newLine();
      _xblockexpression = this.pythonCode.append(_builder_4);
    }
    return _xblockexpression;
  }

  public StringBuilder generate(final Surfer action, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import webbrowser");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def open_default_browser(url):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("webbrowser.open(url)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Exemple d\'utilisation");
    _builder.newLine();
    _builder.append("url_to_open = \"");
    String _url = action.getUrl();
    _builder.append(_url);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("open_default_browser(url_to_open)");
    _builder.newLine();
    return this.pythonCode.append(_builder);
  }

  public StringBuilder generate(final WifiCreate action, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Your Python code for WifiCreate goes here");
    _builder.newLine();
    return this.pythonCode.append(_builder);
  }

  public StringBuilder generate(final Typewrite action, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Your Python code for Typewrite goes here");
    _builder.newLine();
    return this.pythonCode.append(_builder);
  }

  public StringBuilder generate(final WordTypingAuto action, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import time");
    _builder.newLine();
    _builder.append("import pyautogui");
    _builder.newLine();
    _builder.append("import subprocess");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Ouvrir Microsoft Word 2019");
    _builder.newLine();
    _builder.append("subprocess.Popen([\"C:\\\\Program Files\\\\Microsoft Office\\\\root\\\\Office16\\\\WINWORD.EXE\"])");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Attendre quelques secondes pour que Word se charge");
    _builder.newLine();
    _builder.append("time.sleep(5)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Ajouter un délai supplémentaire avant de commencer la saisie");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Par exemple, appuyer sur la touche Entrée");
    _builder.newLine();
    _builder.append("pyautogui.press(\"enter\")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Effectuer des saisies en utilisant PyAutoGUI avec un intervalle entre les caractères");
    _builder.newLine();
    _builder.append("text=\"");
    String _teny = action.getTeny();
    _builder.append(_teny);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("pyautogui.typewrite(text, interval=0.05)  # Ajustez l\'intervalle selon vos besoins");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Par exemple, appuyer sur la touche Entrée");
    _builder.newLine();
    _builder.append("pyautogui.press(\"enter\")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Vous pouvez également effectuer d\'autres actions, comme déplacer la souris");
    _builder.newLine();
    _builder.append("pyautogui.moveTo(500, 500)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Attendre quelques secondes pour voir le résultat");
    _builder.newLine();
    _builder.append("time.sleep(5)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Fermer Word (cela dépend du système d\'exploitation, vous devrez peut-être ajuster cela)");
    _builder.newLine();
    _builder.append("# Dans ce cas, on suppose que la fenêtre de Word est active");
    _builder.newLine();
    _builder.append("# pyautogui.hotkey(\'alt\', \'f4\')");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return this.pythonCode.append(_builder);
  }
}
