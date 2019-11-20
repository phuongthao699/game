@extends('layout')
@section('main-content')
<div class="row">
    <div class="col-12">
        <div class="card">
            <div class="card-body">
                <h4 class="header-title">Danh sách lượt chơi</h4>
                <a href="{{route('luot-choi.them-moi')}}" class="btn btn-primary waves-effect waves-light">Thêm mới</a>
                <br>
                <table id="luot-choi-table" class="table dt-responsive nowrap">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>ID Người chơi </th>
                            <th>Số câu</th>
                            <th>Điểm</th>
                            <th>Ngày giờ</th>
                            <th></th>
                        </tr>
                    </thead>
                
                
                   <tbody>
                        @foreach($listLinhVuc as $luotChoi)
                            <tr>
                                <th>{{ $luotChoi->id }}</th>
                                <th>{{ $luotChoi->nguoi_choi_id }}</th>
                                <th>{{ $luotChoi->so_cau }}</th>
                                <th>{{ $luotChoi->diem }}</th>
                                <th>{{ $luotChoi->ngay_gio }}</th>
                                <th>
                                    <a href="{{ route('luot-choi.cap-nhat', ['id' =>$luotChoi->id]) }}" class="btn btn-success waves-effect waves-light"><i class="mdi mdi-grease-pencil"></i></a>
                                </th>
                            </tr>
                        @endforeach
                   </tbody>
                </table>

            </div> <!-- end card body-->
        </div> <!-- end card -->
    </div><!-- end col-->
</div>
<!-- end row-->

@endsection

@section('css')
 <!-- third party css -->
    <link href="{{asset ('assets/libs/datatables/dataTables.bootstrap4.css') }}" rel="stylesheet" type="text/css" />
    <link href="{{asset ('assets/libs/datatables/responsive.bootstrap4.css') }}" rel="stylesheet" type="text/css" />
    <link href="{{asset ('assets/libs/datatables/buttons.bootstrap4.css') }}" rel="stylesheet" type="text/css" />
    <link href="{{asset ('assets/libs/datatables/select.bootstrap4.css') }}" rel="stylesheet" type="text/css" />
<!-- third party css end -->
@endsection

@section('js')
 <!-- third party js -->
<script src="{{asset ('assets/libs/datatables/jquery.dataTables.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/dataTables.bootstrap4.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/dataTables.responsive.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/responsive.bootstrap4.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/dataTables.buttons.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/buttons.bootstrap4.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/buttons.html5.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/buttons.flash.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/buttons.print.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/dataTables.keyTable.min.js') }}"></script>
<script src="{{asset ('assets/libs/datatables/dataTables.select.min.js') }}"></script>
<script src="{{asset ('assets/libs/pdfmake/pdfmake.min.js') }}"></script>
<script src="{{asset ('assets/libs/pdfmake/vfs_fonts.js') }}"></script>
<!-- third party js ends -->

<script type="text/javascript">
   $(document).ready(function(){
        $("#luot-choi-table").DataTable({
            language:{
                paginate:{
                    previous:"<i class='mdi mdi-chevron-left'>",
                    next:"<i class='mdi mdi-chevron-right'>"
                    }
            },
            drawCallback:function(){
                $(".dataTables_paginate > .pagination").addClass("pagination-rounded")
                }
        }); 
    }); 
</script>


@endsection

