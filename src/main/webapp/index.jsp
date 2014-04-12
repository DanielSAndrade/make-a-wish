<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>MakeWish | Mágico dos Sonhos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="stilearning">

    <meta http-equiv="x-pjax-version" content="v173">

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <!-- fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="ico/favico-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="ico/favico-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="ico/favico-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="ico/favico-57-precomposed.png">
    <link rel="shortcut icon" href="ico/favico.png">
    <link rel="shortcut icon" href="ico/favico.ico">

    <!-- build:css styles/vendor.css -->
    <!-- bower:css -->
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">
    <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="bower_components/animate.css/animate.css">
    <link rel="stylesheet" href="bower_components/Hover/css/hover.css">
    <!-- endbower -->
    <!-- endbuild -->

    <!-- build:css(.tmp) styles/main.css -->
    <link id="style-components" href="styles/loaders.css" rel="stylesheet">
    <link id="style-components" href="styles/bootstrap-theme.css" rel="stylesheet">
    <link id="style-components" href="styles/dependencies.css" rel="stylesheet">
    <link id="style-base" href="styles/stilearn.css" rel="stylesheet">
    <link id="style-responsive" href="styles/stilearn-responsive.css" rel="stylesheet">
    <link id="style-helper" href="styles/helper.css" rel="stylesheet">
    <link id="style-sample" href="styles/pages-style.css" rel="stylesheet">
    <!-- endbuild -->

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
          <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7/html5shiv.min.js"></script>
        <![endif]-->
</head>

<body class="animated fadeIn">
    <!-- section header -->
    <header class="header">
        <!-- header brand -->
        <div class="header-brand">
            <i class="fa fa-magic" style="float:left; font-size:18px; line-height: 18px;"></i>
            <a href="index.html" class="brand-logo" style="font-size:18px;">               
                Mágico de Sonhos
            </a>
        </div>
        <!-- header brand -->
        <!-- header-profile -->
        <div class="header-profile">
            <div class="profile-nav">
                <span class="profile-username">Mesa 3</span>
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <span class="fa fa-angle-down"></span>
                </a>
                <ul class="dropdown-menu animated flipInX pull-right" role="menu">
                    <li><a href="#"><i class="fa fa-user"></i> Mesa</a>
                    </li>
                    <li><a href="#"><i class="fa fa-trophy"> Sala da Fama</i></a>
                    </li>
                    <li><a href="#"><i class="fa fa-tasks"></i> Sala da Fama</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="#"><i class="fa fa-sign-out"></i> Sair</a>
                    </li>
                </ul>
            </div>
            <div class="profile-picture">
                <a data-toggle="side-right" href="#"> <img alt="" src="images/dummy/profile.jpg"></a>
            </div>
        </div>
        <!-- header-profile -->


        <!-- header menu -->
        <ul class="hidden-xs header-menu pull-right">
            <li>
                <a href="#" title="View site">
                    <i class="header-menu-icon icon-only fa fa-rocket"></i>
                </a>
            </li>
            <!-- /header-menu-item -->
            <li>
                <a href="#" title="Notifications" class="dropdown-toggle" data-toggle="dropdown" role="button">
                    <span class="badge badge-success">4</span>
                    <i class="header-menu-icon icon-only fa fa-warning"></i>
                </a>
                <ul class="dropdown-menu dropdown-extend animated fadeInDown pull-right" role="menu">
                    <li class="dropdown-header">Badges</li>
                    <!-- /dropdown-header -->
                    <li class="notif-minimal" data-toggle="niceScroll" data-scroll-cursorcolor="#ecf0f1">
                        <a class="notif-item" href="#">
                            <div class="notif-ico bg-primary">
                                <i class="fa fa-bullseye"></i>
                            </div>
                            <p class="notif-text">
                                <span class="text-bold">Materializa?o de brinquedos</span></p>
                        </a>
                    </li>
                    <!-- /dropdown-alert -->
                    <li class="dropdown-footer bg-cloud">
                        <a class="view-all" tabindex="-1" href="#">
                            <i class="fa fa-angle-right pull-right"></i> See all notifications
                        </a>
                    </li>
                    <!-- /dropdown-footer -->
                </ul>
                <!-- /dropdown-extend -->
            </li>
            <!-- /header-menu-item -->
            <li>
                <a href="#" title="Inboxs" class="dropdown-toggle" data-toggle="side-right" role="button">
                    <span class="badge badge-warning animated animated-repeat flash">3</span>
                    <i class="header-menu-icon icon-only fa fa-envelope-o"></i>
                </a>               
            </li>
            <!-- /header-menu-item -->
            <li>
                <a href="#" title="Tasks" class="dropdown-toggle" data-toggle="dropdown" role="button">
                    <span class="badge badge-danger">7</span>
                    <i class="header-menu-icon icon-only fa fa-tasks"></i>
                </a>
                <ul class="dropdown-menu dropdown-extend animated fadeInDown pull-right" role="menu">
                    <li class="dropdown-header">Tasks progress</li>
                    <!-- /dropdown-header -->
                    <li class="notif-progress" data-toggle="niceScroll" data-scroll-cursorcolor="#ecf0f1">
                        <a class="notif-item" href="#">
                            <div class="notif-text pull-right">60%</div>
                            <div class="notif-text">Uploading...</div>
                            <div class="progress progress-sm">
                                <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                                    <span class="sr-only">60% Complete</span>
                                </div>
                            </div>
                        </a>
                        <!-- /notif-item -->
                        <a class="notif-item" href="#">
                            <div class="notif-text pull-right">33%</div>
                            <div class="notif-text">Upgrade Theme</div>
                            <div class="progress progress-sm">
                                <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="33" aria-valuemin="0" aria-valuemax="100" style="width: 33%;">
                                    <span class="sr-only">33% Complete</span>
                                </div>
                            </div>
                        </a>                                                
                        <!-- /notif-item -->
                    </li>
                    <!-- /dropdown-alert -->
                    <li class="dropdown-footer bg-cloud">
                        <a class="view-all" tabindex="-1" href="#">
                            <i class="fa fa-angle-right pull-right"></i> See all Tasks
                        </a>
                    </li>
                    <!-- /dropdown-footer -->
                </ul>
                <!-- /dropdown-extend -->
            </li>
            <!-- /header-menu-item -->
        </ul>
        <!--/header-menu pull-right-->
    </header>
    <!--/header-->


    <!-- sidebar content section -->
    <section class="section">
        <!-- DONT FORGET REPLACE IT FOR PRODUCTION! -->
        <aside class="side-left">
            <ul class="sidebar">
                <li>
                    <a href="index.php" data-pjax=".content-body">
                        <div class="badge badge-primary animated animated-repeat wobble">4</div>
                        <i class="sidebar-icon fa fa-th-large"></i>
                        <span class="sidebar-text">Todos</span>
                    </a>
                </li>
                <li>
                    <a href="index.php" data-pjax=".content-body">
                        <div class="badge badge-primary animated animated-repeat wobble">2</div>
                        <i class="sidebar-icon fa fa-suitcase"></i>
                        <span class="sidebar-text">Viagem</span>
                    </a>
                </li>
                <li>
                    <a href="index.php" data-pjax=".content-body">
                        <div class="badge badge-primary animated animated-repeat wobble">2</div>
                        <i class="sidebar-icon fa fa-coffee"></i>
                        <span class="sidebar-text">Gourmet</span>
                    </a>
                </li>
            </ul>
            <!--/sidebar-->
        </aside>
        <!--/side-left-->

        <div class="content">
            <div class="content-body">
                <!-- Product Session -->
                <div id="error-placement2"></div>
                <h3 class="lead"><i class="fa fa-star"></i> Magicas a Fazer</h3>
                <div class="row">
                    <div class="col-md-4">
                        <div id="contentfeeds1" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds1" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds1" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="no-padding jumbotron bg-inverse">
                                    <div class="tile">
                                        <div class="img-wrapper">
                                            <img class="lazy" data-original="images/dummy/img2.png" alt="">
                                        </div>
                                    </div>

                                    <div class="jumbotron-text">
                                        <p class="lead">Show do Luan Santana</p>
                                        <p class="clearfix">
                                            <span class="pull-right">
                                                <a href="#" class="btn btn-xs btn-inverse btn-rounded">#luanstana</a>
                                                <a href="#" class="btn btn-xs btn-inverse btn-rounded">#make-a-wish</a>
                                            </span>
                                        </p>
                                    </div>
                                </div>
                                <!--/jumbotron-->

                                <div class="profile-line clearfix">
                                    <!-- <img class="img-circle pull-left" src="images/dummy/uifaces14.jpg" alt="uifaces14" width="46px" width="46px" /> -->
                                    <div class="text-14">
                                    	<i class="fa fa-ticket"></i>
                                        <strong>Ingresso Luan Santana</strong>
                                    </div>                                    
                                </div>
                                <!--/profile-line-->

                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius, dolores facilis maiores minus itaque excepturi.</p>

                                <p class="text-muted pull-right"><i class="fa fa-heart"></i> 16</p>
                            </div>
                            <!--panel-body-->

                            <div class="panel-body">
                                <form action="/sign" method="post" role="form">
                                    <div class="input-group input-group-in">
                                        <input type="hidden" name="produto" value="Show Luan Santana" />
                                        <input type="hidden" name="valor" value="50.0" />
                                        
                                        <input type="text" name="comprador" class="form-control" placeholder="Nome do Magico" />
                                        <span class="input-group-btn">
                                            <button class="btn btn-transparent text-muted btn-file" type="button">
                                                <i class="fa fa-user"></i>                                                
                                            </button>
                                        </span>
                                    </div>
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Código do Vendedor" />
                                        <span class="input-group-btn">
                                            <span class="fileinput fileinput-new" data-provides="fileinput">
                                                <button class="btn btn-transparent text-muted btn-file" type="button">
                                                    <i class="fileinput-new fa fa-lock"></i>
                                                    <input type="file" name="fileinput_inline[]">
                                                </button>
                                                <button class="btn btn-transparent fileinput-exists text-muted" rel="tooltip-bottom" title="Senha" data-dismiss="fileinput"><i class="fa fa-times"></i>
                                                </button>
                                            </span>
                                        </span>
                                    </div>
                                    <div style="margin-top:10px; text-align:center;">
                                        <input type="submit" class="btn btn-primary" value="Faça Acontecer"></input>
                                    </div>
                                </form>
                                <!--/form-->
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->                 
                    </div>
                    <!--/cols-->


                    <div class="col-md-4">
                        <div id="contentfeeds2" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds2" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds2" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="profile-line clearfix">
<!--                                    <img class="img-circle pull-left" src="images/dummy/uifaces19.jpg" alt="uifaces19" width="46px" width="46px" />-->
                                    <div class="text-14">
                                        <strong>Felipe Joaquim dos Santos</strong>
                                    </div>
                                    <div class="text-muted">
                                        <small>8 anos de idade</small>
                                    </div>
                                </div>
                                <!--/profile-line-->

                                <div class="no-padding jumbotron bg-primary">
                                    <p class="lead">Meu Sonho é  conhecer a Disney</p>
                                    <p class="clearfix">
                                        <span class="pull-right">
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#manage</a>
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#workFlow</a>
                                        </span>
                                    </p>
                                </div>
                                <!--/jumbotron-->

                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius, dolores facilis maiores minus itaque excepturi.</p>

                                <p class="text-muted pull-right"><i class="fa fa-comment"></i> 47 &nbsp;&nbsp;&nbsp; <i class="fa fa-heart"></i> 98</p>
                            </div>
                            <!--panel-body-->
                            
                        </div>
                        <!--/panel-->                     
                    </div>
                    <!--/cols-->


                
                </div>
                <!--/row-->

            </div>
            <!--/content-body -->
        </div>
        <!--/content -->

    </section>
    <!--/content section -->


    <!-- side-right -->
    <aside class="side-right">
        <div class="module" data-toggle="niceScroll">
            <div class="chat-contact">
                <h3 class="contact-heading">
                    <div class="btn-group pull-right">
                        <a href="#" data-toggle="side-right">
                            <i class="fa fa-times text-sm"></i>
                        </a>
                    </div>
                    <i class="fa fa-trophy"></i> Sala da Fama
                    
                </h3>
                <!-- /contact-heading -->

                <div class="contact-body">
                    <ul class="contacts-list">
                        <li class="separate">Top Mágicos</li>
                        <li class="idle"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i>11293 Jose Wilcker</a>
                        </li>
                        <li class="idle"><a href="#"><i class="fa fa-circle-o" title="offline" rel="tooltip-bottom"></i>8900 Xuxa Menegal</a>
                        </li>
                        <li class="online"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i>8604 William Bonner</a>
                        </li>
                        <li class="online"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i>8502 Neymar Jr.</a>
                        </li>
                        <li class="idle"><a href="#"><i class="fa fa-circle-o" title="idle" rel="tooltip-bottom"></i>6530 Teresa Cristina</a>
                        </li>
                                               
                        <li class="idle"><a href="#"><i class="fa fa-circle-o" title="idle" rel="tooltip-bottom"></i>6452 Cristiano Ronaldo</a>
                        </li>
                        <li class="online"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i>4530 Sean Carpenter</a>
                        </li>
                    </ul>
                    <!-- /contacts-list -->
                </div>
                <!-- /contact-body -->
            </div>
            <!-- /chat-contact -->

          
            
            <!-- /chatbox -->
        </div>
        <!-- /module -->
    </aside>
    <!--/side-right -->


    <!-- section footer -->
    <a rel="to-top" href="#top"><i class="fa fa-arrow-up"></i></a>
    <footer>
        <p>&copy; 2014 Hackathon Ci&t - Guitarra</p>
    </footer>



    <!-- javascript
        ================================================== -->
    <!-- List of dependencies file, please check on readme.txt! (Purchase only) -->

    <!-- build:js scripts/vendor-main.js -->
    <!-- bower:js -->
    <script src="bower_components/jquery/jquery.js"></script>
    <script src="bower_components/jqueryui/ui/jquery-ui.js"></script>
    <script src="bower_components/jqueryui-touch-punch/jquery.ui.touch-punch.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-usefull.js -->
    <script src="bower_components/pace/pace.min.js"></script>
    <script src="bower_components/jquery-pjax/jquery.pjax.js"></script>
    <script src="bower_components/masonry/masonry.pkgd.min.js"></script>
    <script src="bower_components/screenfull/dist/screenfull.min.js"></script>
    <script src="bower_components/jquery.nicescroll/jquery.nicescroll.min.js"></script>
    <script src="bower_components/countUp.js/countUp.min.js"></script>
    <script src="bower_components/skycons/skycons.js"></script>
    <script src="bower_components/jquery.lazyload/jquery.lazyload.min.js"></script>
    <script src="bower_components/WOW/dist/wow.min.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-form.js -->
    <script src="bower_components/jquery.validation/jquery.validate.js"></script>
    <script src="bower_components/jquery.validation/additional-methods.js"></script>
    <script src="bower_components/autogrow-textarea/jquery.autogrowtextarea.min.js"></script>
    <script src="bower_components/typeahead.js/dist/typeahead.min.js"></script>
    <script src="bower_components/jQuery-Mask-Plugin/jquery.mask.min.js"></script>
    <script src="bower_components/jquery.tagsinput/jquery.tagsinput.min.js"></script>
    <script src="bower_components/multiselect/js/jquery.multi-select.js"></script>
    <script src="bower_components/select2/select2.js"></script>
    <script src="bower_components/jquery-selectboxit/src/javascripts/jquery.selectBoxIt.js"></script>
    <script src="bower_components/momentjs/moment.js"></script>
    <script src="bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
    <script src="bower_components/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
    <script src="bower_components/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
    <script src="bower_components/jquery-minicolors/jquery.minicolors.min.js"></script>
    <script src="bower_components/dropzone/downloads/dropzone.min.js"></script>
    <script src="bower_components/jquery-steps/build/jquery.steps.min.js"></script>
    <script src="bower_components/fullcalendar/fullcalendar.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-editor.js -->
    <script src="bower_components/wysihtml5/dist/wysihtml5-0.3.0.js"></script>
    <script src="bower_components/bootstrap-wysihtml5/dist/bootstrap-wysihtml5-0.0.2.js"></script>
    <script src="bower_components/bootstrap-markdown/js/markdown.js"></script>
    <script src="bower_components/bootstrap-markdown/js/to-markdown.js"></script>
    <script src="bower_components/bootstrap-markdown/js/bootstrap-markdown.js"></script>
    <!-- endbuild -->


    <!-- build:js scripts/excanvas.js -->
    <!--[if lte IE 8]><script language="javascript" type="text/javascript" src="bower_components/flot/excanvas.min.js"></script><![endif]-->
    <!-- endbuild -->

    <!-- build:js scripts/vendor-graph.js -->
    <script src="bower_components/raphael/raphael-min.js"></script>
    <script src="bower_components/morris.js/morris.min.js"></script>
    <script src="bower_components/flot/jquery.flot.js"></script>
    <script src="bower_components/flot/jquery.flot.resize.js"></script>
    <script src="bower_components/flot/jquery.flot.categories.js"></script>
    <script src="bower_components/flot/jquery.flot.time.js"></script>
    <script src="bower_components/flot-axislabels/jquery.flot.axislabels.js"></script>
    <script src="bower_components/jquery.easy-pie-chart/dist/jquery.easypiechart.js"></script>
    <script src="bower_components/sparkline/dist/jquery.sparkline.min.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-table.js -->
    <script src="bower_components/datatables/media/js/jquery.dataTables.js"></script>
    <script src="bower_components/datatables-tools/js/dataTables.tableTools.js"></script>
    <script src="bower_components/datatables-bootstrap3/BS3/assets/js/datatables.js"></script>
    <script src="bower_components/jquery.tablesorter/js/jquery.tablesorter.js"></script>
    <script src="bower_components/jquery.tablesorter/js/jquery.tablesorter.widgets.js"></script>
    <script src="bower_components/jquery.tablesorter/addons/pager/jquery.tablesorter.pager.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-maps.js -->
    <script src="bower_components/jqvmap/jqvmap/jquery.vmap.min.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.world.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.algeria.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.france.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.germany.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.russia.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.usa.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.africa.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.asia.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.australia.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.europe.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.north-america.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.south-america.js"></script>
    <script src="bower_components/jqvmap/jqvmap/data/jquery.vmap.sampledata.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-util.js -->
    <script src="bower_components/holderjs/holder.js"></script>
    <!-- endbower -->
    <!-- endbuild -->


    <!-- required stilearn template js -->
    <!-- build:js scripts/main.js -->
    <script src="scripts/bootstrap-jasny/js/fileinput.js"></script>
    <script src="scripts/js-prototype.js"></script>
    <script src="scripts/slip.js"></script>
    <script src="scripts/hogan-2.0.0.js"></script>
    <script src="scripts/theme-setup.js"></script>
    <script src="scripts/chat-setup.js"></script>
    <script src="scripts/panel-setup.js"></script>
    <!-- endbuild -->

    <!-- This scripts will be reload after pjax or if popstate event is active (use with class .re-execute) -->
    <!-- build:js scripts/initializer.js -->
    <script class="re-execute" src="scripts/google-code-prettify/run_prettify.js"></script>
    <script class="re-execute" src="scripts/bootstrap-setup.js"></script>
    <script class="re-execute" src="scripts/jqueryui-setup.js"></script>
    <script class="re-execute" src="scripts/dependencies-setup.js"></script>
    <script class="re-execute" src="scripts/demo-setup.js"></script>
    <!-- endbuild -->

</body>

</html>
