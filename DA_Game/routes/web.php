<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('layout');
})->name('dashboard');
		
Route::prefix('linh_vuc')->group(function(){
	Route::name('linh_vuc.')->group(function(){
		Route::get('/','LinhVucController@index')->name('danh-sach');
		Route::get('them-moi','LinhVucController@create')->name('them-moi');
		Route::post('them-moi','LinhVucController@store')->name('xu-ly-them-moi');
		Route::get('cap-nhat/{id}','LinhVucController@edit')->name('cap-nhat');
		Route::post('cap-nhat/{id}','LinhVucController@update')->name('xu-ly-cap-nhat');
		Route::get('xoa/{id}','LinhVucController@destroy')->name('xoa');
	});
});
Route::prefix('cau-hoi')->group(function(){
	Route::name('cau-hoi.')->group(function(){
		Route::get('/','CauHoiController@index')->name('danh-sach');
		Route::get('them-moi','CauHoiController@create')->name('them-moi');
		Route::post('them-moi','CauHoiController@store')->name('xu-ly-them-moi');
		Route::get('cap-nhat/{id}','CauHoiController@edit')->name('cap-nhat');
		Route::post('cap-nhat/{id}','CauHoiController@update')->name('xu-ly-cap-nhat');
		Route::get('xoa/{id}','CauHoiController@destroy')->name('xoa');
	});
});
Route::prefix('nguoi-choi')->group(function(){
	Route::name('nguoi-choi.')->group(function(){
		Route::get('/','NguoiChoiController@index')->name('danh-sach');
		Route::get('them-moi','NguoiChoiController@create')->name('them-moi');
		Route::post('them-moi','NguoiChoiController@store')->name('xu-ly-them-moi');
		Route::get('cap-nhat/{id}','NguoiChoiController@edit')->name('cap-nhat');
		Route::post('cap-nhat/{id}','NguoiChoiController@update')->name('xu-ly-cap-nhat');
		Route::get('xoa/{id}','NguoiChoiController@destroy')->name('xoa');
	});
});
