.class public final Ly4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/c$b;,
        Ly4/c$a;
    }
.end annotation


# instance fields
.field public final a:Ly4/i;

.field public final b:Lv4/m;

.field public final c:Ly4/d;

.field public final d:Lz4/c;

.field public e:Z


# direct methods
.method public constructor <init>(Ly4/i;Lv4/d;Lv4/m;Ly4/d;Lz4/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/c;->a:Ly4/i;

    iput-object p3, p0, Ly4/c;->b:Lv4/m;

    iput-object p4, p0, Ly4/c;->c:Ly4/d;

    iput-object p5, p0, Ly4/c;->d:Lz4/c;

    return-void
.end method


# virtual methods
.method public final a()Ly4/e;
    .locals 1

    iget-object v0, p0, Ly4/c;->d:Lz4/c;

    invoke-interface {v0}, Lz4/c;->h()Ly4/e;

    move-result-object v0

    return-object v0
.end method

.method public final b(Z)Lv4/b0$a;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Ly4/c;->d:Lz4/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz4/c;->f(Z)Lv4/b0$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lw4/a;->a:Lv4/u$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iput-object p0, p1, Lv4/b0$a;->m:Ly4/c;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    :cond_0
    return-object p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    iget-object v0, p0, Ly4/c;->b:Lv4/m;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ly4/c;->c(Ljava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    throw p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ly4/c;->c:Ly4/d;

    .line 2
    .line 3
    iget-object v1, v0, Ly4/d;->c:Ly4/f;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    const/4 v2, 0x1

    .line 7
    :try_start_0
    iput-boolean v2, v0, Ly4/d;->h:Z

    .line 8
    .line 9
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    iget-object v0, p0, Ly4/c;->d:Lz4/c;

    .line 11
    .line 12
    invoke-interface {v0}, Lz4/c;->h()Ly4/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v3, v0, Ly4/e;->b:Ly4/f;

    .line 17
    .line 18
    monitor-enter v3

    .line 19
    :try_start_1
    instance-of v1, p1, Lb5/v;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    check-cast p1, Lb5/v;

    .line 24
    .line 25
    iget p1, p1, Lb5/v;->b:I

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    if-ne p1, v1, :cond_0

    .line 29
    .line 30
    iget p1, v0, Ly4/e;->n:I

    .line 31
    .line 32
    add-int/2addr p1, v2

    .line 33
    iput p1, v0, Ly4/e;->n:I

    .line 34
    .line 35
    if-le p1, v2, :cond_5

    .line 36
    .line 37
    :goto_0
    iput-boolean v2, v0, Ly4/e;->k:Z

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    const/4 v1, 0x6

    .line 41
    if-eq p1, v1, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v1, v0, Ly4/e;->h:Lb5/g;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    move v1, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v1, 0x0

    .line 51
    :goto_1
    if-eqz v1, :cond_3

    .line 52
    .line 53
    instance-of v1, p1, Lb5/a;

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    :cond_3
    iput-boolean v2, v0, Ly4/e;->k:Z

    .line 58
    .line 59
    iget v1, v0, Ly4/e;->m:I

    .line 60
    .line 61
    if-nez v1, :cond_5

    .line 62
    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    iget-object v1, v0, Ly4/e;->b:Ly4/f;

    .line 66
    .line 67
    iget-object v4, v0, Ly4/e;->c:Lv4/e0;

    .line 68
    .line 69
    invoke-virtual {v1, v4, p1}, Ly4/f;->a(Lv4/e0;Ljava/io/IOException;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    :goto_2
    iget p1, v0, Ly4/e;->l:I

    .line 73
    .line 74
    add-int/2addr p1, v2

    .line 75
    iput p1, v0, Ly4/e;->l:I

    .line 76
    .line 77
    :cond_5
    monitor-exit v3

    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    throw p1

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    throw p1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
