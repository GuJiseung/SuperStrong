.class public abstract Landroidx/fragment/app/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/a0$j;,
        Landroidx/fragment/app/a0$l;,
        Landroidx/fragment/app/a0$n;,
        Landroidx/fragment/app/a0$m;,
        Landroidx/fragment/app/a0$k;
    }
.end annotation


# instance fields
.field public A:Landroidx/activity/result/d;

.field public B:Landroidx/activity/result/d;

.field public C:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Landroidx/fragment/app/a0$l;",
            ">;"
        }
    .end annotation
.end field

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/a;",
            ">;"
        }
    .end annotation
.end field

.field public J:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/o;",
            ">;"
        }
    .end annotation
.end field

.field public L:Landroidx/fragment/app/d0;

.field public final M:Landroidx/fragment/app/a0$f;

.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/a0$m;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public final c:Landroidx/fragment/app/h0;

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/o;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Landroidx/fragment/app/x;

.field public g:Landroidx/activity/OnBackPressedDispatcher;

.field public final h:Landroidx/fragment/app/a0$b;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/fragment/app/c;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Landroidx/fragment/app/y;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/fragment/app/e0;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Landroidx/fragment/app/z;

.field public final o:Landroidx/fragment/app/q;

.field public final p:Landroidx/activity/g;

.field public final q:Landroidx/fragment/app/z;

.field public final r:Landroidx/fragment/app/a0$c;

.field public s:I

.field public t:Landroidx/fragment/app/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/fragment/app/w<",
            "*>;"
        }
    .end annotation
.end field

.field public u:Landroidx/activity/result/c;

.field public v:Landroidx/fragment/app/o;

.field public w:Landroidx/fragment/app/o;

.field public final x:Landroidx/fragment/app/a0$d;

.field public final y:Landroidx/fragment/app/a0$e;

.field public z:Landroidx/activity/result/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    new-instance v0, Landroidx/fragment/app/h0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/fragment/app/h0;-><init>(I)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    new-instance v0, Landroidx/fragment/app/x;

    invoke-direct {v0, p0}, Landroidx/fragment/app/x;-><init>(Landroidx/fragment/app/a0;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->f:Landroidx/fragment/app/x;

    new-instance v0, Landroidx/fragment/app/a0$b;

    invoke-direct {v0, p0}, Landroidx/fragment/app/a0$b;-><init>(Landroidx/fragment/app/a0;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->h:Landroidx/fragment/app/a0$b;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/a0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/a0;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/a0;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Landroidx/fragment/app/y;

    invoke-direct {v0, p0}, Landroidx/fragment/app/y;-><init>(Landroidx/fragment/app/a0;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->l:Landroidx/fragment/app/y;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/a0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Landroidx/fragment/app/z;

    invoke-direct {v0, v1, p0}, Landroidx/fragment/app/z;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->n:Landroidx/fragment/app/z;

    new-instance v0, Landroidx/fragment/app/q;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Landroidx/fragment/app/q;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->o:Landroidx/fragment/app/q;

    new-instance v0, Landroidx/activity/g;

    invoke-direct {v0, v1, p0}, Landroidx/activity/g;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->p:Landroidx/activity/g;

    new-instance v0, Landroidx/fragment/app/z;

    invoke-direct {v0, v1, p0}, Landroidx/fragment/app/z;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->q:Landroidx/fragment/app/z;

    new-instance v0, Landroidx/fragment/app/a0$c;

    invoke-direct {v0, p0}, Landroidx/fragment/app/a0$c;-><init>(Landroidx/fragment/app/a0;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->r:Landroidx/fragment/app/a0$c;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/a0;->s:I

    new-instance v0, Landroidx/fragment/app/a0$d;

    invoke-direct {v0, p0}, Landroidx/fragment/app/a0$d;-><init>(Landroidx/fragment/app/a0;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->x:Landroidx/fragment/app/a0$d;

    new-instance v0, Landroidx/fragment/app/a0$e;

    invoke-direct {v0}, Landroidx/fragment/app/a0$e;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/a0;->y:Landroidx/fragment/app/a0$e;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/a0;->C:Ljava/util/ArrayDeque;

    new-instance v0, Landroidx/fragment/app/a0$f;

    invoke-direct {v0, p0}, Landroidx/fragment/app/a0$f;-><init>(Landroidx/fragment/app/a0;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->M:Landroidx/fragment/app/a0$f;

    return-void
.end method

.method public static J(I)Z
    .locals 1

    const-string v0, "FragmentManager"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static K(Landroidx/fragment/app/o;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/h0;->f()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    move v1, v0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroidx/fragment/app/o;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v2}, Landroidx/fragment/app/a0;->K(Landroidx/fragment/app/o;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :cond_1
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    :cond_2
    return v0
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

.method public static M(Landroidx/fragment/app/o;)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-boolean v1, p0, Landroidx/fragment/app/o;->C:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    if-eqz v1, :cond_2

    iget-object p0, p0, Landroidx/fragment/app/o;->v:Landroidx/fragment/app/o;

    invoke-static {p0}, Landroidx/fragment/app/a0;->M(Landroidx/fragment/app/o;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return v0
.end method

.method public static N(Landroidx/fragment/app/o;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroidx/fragment/app/o;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    iget-object p0, v1, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    .line 16
    .line 17
    invoke-static {p0}, Landroidx/fragment/app/a0;->N(Landroidx/fragment/app/o;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    return v0
    .line 26
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

.method public static d0(Landroidx/fragment/app/o;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "show: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/o;->z:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/o;->z:Z

    iget-boolean v0, p0, Landroidx/fragment/app/o;->J:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/o;->J:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Landroidx/fragment/app/a0$m;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/fragment/app/a0;->G:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/fragment/app/a0;->y(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {p1, p2, v0}, Landroidx/fragment/app/a0$m;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/fragment/app/a0;->b:Z

    .line 27
    .line 28
    :try_start_0
    iget-object p1, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/a0;->V(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->g0()V

    .line 45
    .line 46
    .line 47
    iget-boolean p1, p0, Landroidx/fragment/app/a0;->H:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, Landroidx/fragment/app/a0;->H:Z

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e0()V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/fragment/app/h0;->b()V

    .line 60
    .line 61
    .line 62
    return-void
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    iget-boolean v5, v5, Landroidx/fragment/app/i0;->o:Z

    iget-object v6, v0, Landroidx/fragment/app/a0;->K:Ljava/util/ArrayList;

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Landroidx/fragment/app/a0;->K:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v6, v0, Landroidx/fragment/app/a0;->K:Ljava/util/ArrayList;

    iget-object v7, v0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    invoke-virtual {v7}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1
    iget-object v6, v0, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    move v9, v3

    const/4 v10, 0x0

    :goto_1
    const/4 v13, 0x1

    if-ge v9, v4, :cond_13

    .line 2
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/a;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    if-nez v15, :cond_d

    iget-object v15, v0, Landroidx/fragment/app/a0;->K:Ljava/util/ArrayList;

    const/4 v12, 0x0

    .line 3
    :goto_2
    iget-object v8, v14, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v12, v11, :cond_c

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/i0$a;

    iget v3, v11, Landroidx/fragment/app/i0$a;->a:I

    if-eq v3, v13, :cond_b

    const/4 v13, 0x2

    const/16 v2, 0x9

    if-eq v3, v13, :cond_5

    const/4 v13, 0x3

    if-eq v3, v13, :cond_3

    const/4 v13, 0x6

    if-eq v3, v13, :cond_3

    const/4 v13, 0x7

    if-eq v3, v13, :cond_2

    const/16 v13, 0x8

    if-eq v3, v13, :cond_1

    goto :goto_3

    :cond_1
    new-instance v3, Landroidx/fragment/app/i0$a;

    const/4 v13, 0x0

    invoke-direct {v3, v2, v6, v13}, Landroidx/fragment/app/i0$a;-><init>(ILandroidx/fragment/app/o;I)V

    invoke-virtual {v8, v12, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v2, 0x1

    iput-boolean v2, v11, Landroidx/fragment/app/i0$a;->c:Z

    add-int/lit8 v12, v12, 0x1

    iget-object v6, v11, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    goto :goto_3

    :cond_2
    move-object/from16 v20, v7

    const/4 v1, 0x1

    goto/16 :goto_7

    :cond_3
    iget-object v3, v11, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v3, v11, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    if-ne v3, v6, :cond_4

    new-instance v6, Landroidx/fragment/app/i0$a;

    invoke-direct {v6, v2, v3}, Landroidx/fragment/app/i0$a;-><init>(ILandroidx/fragment/app/o;)V

    invoke-virtual {v8, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v20, v7

    const/4 v1, 0x1

    const/4 v6, 0x0

    goto/16 :goto_8

    :cond_4
    :goto_3
    move-object/from16 v20, v7

    const/4 v1, 0x1

    goto/16 :goto_8

    :cond_5
    iget-object v3, v11, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    iget v13, v3, Landroidx/fragment/app/o;->x:I

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v17

    const/16 v16, -0x1

    add-int/lit8 v17, v17, -0x1

    move/from16 v2, v17

    const/16 v17, 0x0

    :goto_4
    if-ltz v2, :cond_9

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v7

    move-object/from16 v7, v19

    check-cast v7, Landroidx/fragment/app/o;

    iget v1, v7, Landroidx/fragment/app/o;->x:I

    if-ne v1, v13, :cond_8

    if-ne v7, v3, :cond_6

    move/from16 v18, v13

    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_6

    :cond_6
    if-ne v7, v6, :cond_7

    new-instance v1, Landroidx/fragment/app/i0$a;

    move/from16 v18, v13

    const/16 v6, 0x9

    const/4 v13, 0x0

    invoke-direct {v1, v6, v7, v13}, Landroidx/fragment/app/i0$a;-><init>(ILandroidx/fragment/app/o;I)V

    invoke-virtual {v8, v12, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x0

    goto :goto_5

    :cond_7
    move/from16 v18, v13

    const/16 v1, 0x9

    const/4 v13, 0x0

    :goto_5
    new-instance v1, Landroidx/fragment/app/i0$a;

    move-object/from16 v21, v6

    const/4 v6, 0x3

    invoke-direct {v1, v6, v7, v13}, Landroidx/fragment/app/i0$a;-><init>(ILandroidx/fragment/app/o;I)V

    iget v6, v11, Landroidx/fragment/app/i0$a;->d:I

    iput v6, v1, Landroidx/fragment/app/i0$a;->d:I

    iget v6, v11, Landroidx/fragment/app/i0$a;->f:I

    iput v6, v1, Landroidx/fragment/app/i0$a;->f:I

    iget v6, v11, Landroidx/fragment/app/i0$a;->e:I

    iput v6, v1, Landroidx/fragment/app/i0$a;->e:I

    iget v6, v11, Landroidx/fragment/app/i0$a;->g:I

    iput v6, v1, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v8, v12, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    add-int/2addr v12, v1

    move-object/from16 v6, v21

    goto :goto_6

    :cond_8
    move/from16 v18, v13

    const/4 v1, 0x1

    :goto_6
    add-int/lit8 v2, v2, -0x1

    move-object/from16 v1, p1

    move/from16 v13, v18

    move-object/from16 v7, v20

    goto :goto_4

    :cond_9
    move-object/from16 v20, v7

    const/4 v1, 0x1

    if-eqz v17, :cond_a

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v12, v12, -0x1

    goto :goto_8

    :cond_a
    iput v1, v11, Landroidx/fragment/app/i0$a;->a:I

    iput-boolean v1, v11, Landroidx/fragment/app/i0$a;->c:Z

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_b
    move-object/from16 v20, v7

    move v1, v13

    :goto_7
    iget-object v2, v11, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    add-int/2addr v12, v1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move v13, v1

    move-object/from16 v7, v20

    move-object/from16 v1, p1

    goto/16 :goto_2

    :cond_c
    move-object/from16 v20, v7

    goto :goto_b

    :cond_d
    move-object/from16 v20, v7

    move v1, v13

    .line 5
    iget-object v2, v0, Landroidx/fragment/app/a0;->K:Ljava/util/ArrayList;

    .line 6
    iget-object v3, v14, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    .line 7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v1

    :goto_9
    if-ltz v7, :cond_10

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/i0$a;

    iget v11, v8, Landroidx/fragment/app/i0$a;->a:I

    if-eq v11, v1, :cond_f

    const/4 v1, 0x3

    if-eq v11, v1, :cond_e

    packed-switch v11, :pswitch_data_0

    goto :goto_a

    :pswitch_0
    iget-object v11, v8, Landroidx/fragment/app/i0$a;->h:Landroidx/lifecycle/j$c;

    iput-object v11, v8, Landroidx/fragment/app/i0$a;->i:Landroidx/lifecycle/j$c;

    goto :goto_a

    :pswitch_1
    iget-object v6, v8, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    goto :goto_a

    :pswitch_2
    const/4 v6, 0x0

    goto :goto_a

    :cond_e
    :pswitch_3
    iget-object v8, v8, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_f
    const/4 v1, 0x3

    :pswitch_4
    iget-object v8, v8, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_a
    add-int/lit8 v7, v7, -0x1

    const/4 v1, 0x1

    goto :goto_9

    :cond_10
    :goto_b
    if-nez v10, :cond_12

    .line 8
    iget-boolean v1, v14, Landroidx/fragment/app/i0;->g:Z

    if-eqz v1, :cond_11

    goto :goto_c

    :cond_11
    const/4 v10, 0x0

    goto :goto_d

    :cond_12
    :goto_c
    const/4 v10, 0x1

    :goto_d
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, v20

    goto/16 :goto_1

    :cond_13
    move-object/from16 v20, v7

    iget-object v1, v0, Landroidx/fragment/app/a0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v5, :cond_16

    iget v1, v0, Landroidx/fragment/app/a0;->s:I

    const/4 v2, 0x1

    if-lt v1, v2, :cond_16

    move/from16 v1, p3

    :goto_e
    if-ge v1, v4, :cond_16

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-object v3, v3, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/i0$a;

    iget-object v5, v5, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    if-eqz v5, :cond_14

    iget-object v6, v5, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    if-eqz v6, :cond_14

    invoke-virtual {v0, v5}, Landroidx/fragment/app/a0;->g(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;

    move-result-object v5

    move-object/from16 v6, v20

    invoke-virtual {v6, v5}, Landroidx/fragment/app/h0;->h(Landroidx/fragment/app/g0;)V

    goto :goto_10

    :cond_14
    move-object/from16 v6, v20

    :goto_10
    move-object/from16 v20, v6

    goto :goto_f

    :cond_15
    move-object/from16 v6, v20

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_16
    move-object/from16 v2, p1

    move/from16 v1, p3

    :goto_11
    if-ge v1, v4, :cond_22

    .line 9
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    move-object/from16 v5, p2

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const-string v7, "Unknown cmd: "

    if-eqz v6, :cond_1d

    const/4 v6, -0x1

    invoke-virtual {v3, v6}, Landroidx/fragment/app/a;->c(I)V

    .line 10
    iget-object v6, v3, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    :goto_12
    if-ltz v8, :cond_21

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/i0$a;

    iget-object v10, v9, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    if-eqz v10, :cond_1c

    .line 11
    iget-object v11, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    if-nez v11, :cond_17

    goto :goto_13

    :cond_17
    invoke-virtual {v10}, Landroidx/fragment/app/o;->e()Landroidx/fragment/app/o$c;

    move-result-object v11

    const/4 v12, 0x1

    iput-boolean v12, v11, Landroidx/fragment/app/o$c;->a:Z

    .line 12
    :goto_13
    iget v11, v3, Landroidx/fragment/app/i0;->f:I

    const/16 v12, 0x2002

    const/16 v13, 0x1001

    if-eq v11, v13, :cond_1a

    if-eq v11, v12, :cond_19

    const/16 v12, 0x2005

    const/16 v13, 0x1004

    if-eq v11, v12, :cond_19

    const/16 v14, 0x1003

    if-eq v11, v14, :cond_18

    if-eq v11, v13, :cond_1a

    const/4 v12, 0x0

    goto :goto_14

    :cond_18
    move v12, v14

    goto :goto_14

    :cond_19
    move v12, v13

    .line 13
    :cond_1a
    :goto_14
    iget-object v11, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    if-nez v11, :cond_1b

    if-nez v12, :cond_1b

    goto :goto_15

    :cond_1b
    invoke-virtual {v10}, Landroidx/fragment/app/o;->e()Landroidx/fragment/app/o$c;

    iget-object v11, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    iput v12, v11, Landroidx/fragment/app/o$c;->f:I

    .line 14
    :goto_15
    iget-object v11, v3, Landroidx/fragment/app/i0;->n:Ljava/util/ArrayList;

    iget-object v12, v3, Landroidx/fragment/app/i0;->m:Ljava/util/ArrayList;

    .line 15
    invoke-virtual {v10}, Landroidx/fragment/app/o;->e()Landroidx/fragment/app/o$c;

    iget-object v13, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    iput-object v11, v13, Landroidx/fragment/app/o$c;->g:Ljava/util/ArrayList;

    iput-object v12, v13, Landroidx/fragment/app/o$c;->h:Ljava/util/ArrayList;

    .line 16
    :cond_1c
    iget v11, v9, Landroidx/fragment/app/i0$a;->a:I

    iget-object v12, v3, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/a0;

    packed-switch v11, :pswitch_data_1

    :pswitch_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v9, Landroidx/fragment/app/i0$a;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_6
    iget-object v9, v9, Landroidx/fragment/app/i0$a;->h:Landroidx/lifecycle/j$c;

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/a0;->a0(Landroidx/fragment/app/o;Landroidx/lifecycle/j$c;)V

    goto/16 :goto_16

    :pswitch_7
    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->b0(Landroidx/fragment/app/o;)V

    goto :goto_16

    :pswitch_8
    const/4 v9, 0x0

    invoke-virtual {v12, v9}, Landroidx/fragment/app/a0;->b0(Landroidx/fragment/app/o;)V

    goto :goto_16

    :pswitch_9
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v13, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/o;->N(IIII)V

    const/4 v9, 0x1

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/a0;->Z(Landroidx/fragment/app/o;Z)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->h(Landroidx/fragment/app/o;)V

    goto :goto_16

    :pswitch_a
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v13, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/o;->N(IIII)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->d(Landroidx/fragment/app/o;)V

    goto :goto_16

    :pswitch_b
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v13, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/o;->N(IIII)V

    const/4 v9, 0x1

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/a0;->Z(Landroidx/fragment/app/o;Z)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->I(Landroidx/fragment/app/o;)V

    goto :goto_16

    :pswitch_c
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v13, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/o;->N(IIII)V

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Landroidx/fragment/app/a0;->d0(Landroidx/fragment/app/o;)V

    goto :goto_16

    :pswitch_d
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v13, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/o;->N(IIII)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->a(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;

    goto :goto_16

    :pswitch_e
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v13, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/o;->N(IIII)V

    const/4 v9, 0x1

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/a0;->Z(Landroidx/fragment/app/o;Z)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->U(Landroidx/fragment/app/o;)V

    :goto_16
    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_12

    :cond_1d
    const/4 v6, 0x1

    .line 17
    invoke-virtual {v3, v6}, Landroidx/fragment/app/a;->c(I)V

    .line 18
    iget-object v6, v3, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v13, 0x0

    :goto_17
    if-ge v13, v8, :cond_21

    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/i0$a;

    iget-object v10, v9, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    if-eqz v10, :cond_20

    .line 19
    iget-object v11, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    if-nez v11, :cond_1e

    goto :goto_18

    :cond_1e
    invoke-virtual {v10}, Landroidx/fragment/app/o;->e()Landroidx/fragment/app/o$c;

    move-result-object v11

    const/4 v12, 0x0

    iput-boolean v12, v11, Landroidx/fragment/app/o$c;->a:Z

    .line 20
    :goto_18
    iget v11, v3, Landroidx/fragment/app/i0;->f:I

    .line 21
    iget-object v12, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    if-nez v12, :cond_1f

    if-nez v11, :cond_1f

    goto :goto_19

    :cond_1f
    invoke-virtual {v10}, Landroidx/fragment/app/o;->e()Landroidx/fragment/app/o$c;

    iget-object v12, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    iput v11, v12, Landroidx/fragment/app/o$c;->f:I

    .line 22
    :goto_19
    iget-object v11, v3, Landroidx/fragment/app/i0;->m:Ljava/util/ArrayList;

    iget-object v12, v3, Landroidx/fragment/app/i0;->n:Ljava/util/ArrayList;

    .line 23
    invoke-virtual {v10}, Landroidx/fragment/app/o;->e()Landroidx/fragment/app/o$c;

    iget-object v14, v10, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    iput-object v11, v14, Landroidx/fragment/app/o$c;->g:Ljava/util/ArrayList;

    iput-object v12, v14, Landroidx/fragment/app/o$c;->h:Ljava/util/ArrayList;

    .line 24
    :cond_20
    iget v11, v9, Landroidx/fragment/app/i0$a;->a:I

    iget-object v12, v3, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/a0;

    packed-switch v11, :pswitch_data_2

    :pswitch_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v9, Landroidx/fragment/app/i0$a;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_10
    iget-object v9, v9, Landroidx/fragment/app/i0$a;->i:Landroidx/lifecycle/j$c;

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/a0;->a0(Landroidx/fragment/app/o;Landroidx/lifecycle/j$c;)V

    goto :goto_1a

    :pswitch_11
    const/4 v11, 0x0

    invoke-virtual {v12, v11}, Landroidx/fragment/app/a0;->b0(Landroidx/fragment/app/o;)V

    goto :goto_1a

    :pswitch_12
    const/4 v11, 0x0

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->b0(Landroidx/fragment/app/o;)V

    goto :goto_1a

    :pswitch_13
    const/4 v11, 0x0

    iget v14, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v15, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v11, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v14, v15, v11, v9}, Landroidx/fragment/app/o;->N(IIII)V

    const/4 v9, 0x0

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/a0;->Z(Landroidx/fragment/app/o;Z)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->d(Landroidx/fragment/app/o;)V

    goto :goto_1a

    :pswitch_14
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v15, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/o;->N(IIII)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->h(Landroidx/fragment/app/o;)V

    goto :goto_1a

    :pswitch_15
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v15, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/o;->N(IIII)V

    const/4 v9, 0x0

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/a0;->Z(Landroidx/fragment/app/o;Z)V

    invoke-static {v10}, Landroidx/fragment/app/a0;->d0(Landroidx/fragment/app/o;)V

    goto :goto_1a

    :pswitch_16
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v15, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/o;->N(IIII)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->I(Landroidx/fragment/app/o;)V

    goto :goto_1a

    :pswitch_17
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v15, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/o;->N(IIII)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->U(Landroidx/fragment/app/o;)V

    :goto_1a
    const/4 v11, 0x0

    goto :goto_1b

    :pswitch_18
    iget v11, v9, Landroidx/fragment/app/i0$a;->d:I

    iget v14, v9, Landroidx/fragment/app/i0$a;->e:I

    iget v15, v9, Landroidx/fragment/app/i0$a;->f:I

    iget v9, v9, Landroidx/fragment/app/i0$a;->g:I

    invoke-virtual {v10, v11, v14, v15, v9}, Landroidx/fragment/app/o;->N(IIII)V

    const/4 v11, 0x0

    invoke-virtual {v12, v10, v11}, Landroidx/fragment/app/a0;->Z(Landroidx/fragment/app/o;Z)V

    invoke-virtual {v12, v10}, Landroidx/fragment/app/a0;->a(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;

    :goto_1b
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_17

    :cond_21
    const/4 v11, 0x0

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_11

    :cond_22
    move-object/from16 v5, p2

    add-int/lit8 v1, v4, -0x1

    .line 25
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move/from16 v3, p3

    :goto_1c
    if-ge v3, v4, :cond_27

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/a;

    if-eqz v1, :cond_24

    iget-object v7, v6, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    :goto_1d
    if-ltz v7, :cond_26

    iget-object v8, v6, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/i0$a;

    iget-object v8, v8, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    if-eqz v8, :cond_23

    invoke-virtual {v0, v8}, Landroidx/fragment/app/a0;->g(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/fragment/app/g0;->k()V

    :cond_23
    add-int/lit8 v7, v7, -0x1

    goto :goto_1d

    :cond_24
    iget-object v6, v6, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_25
    :goto_1e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_26

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/i0$a;

    iget-object v7, v7, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    if-eqz v7, :cond_25

    invoke-virtual {v0, v7}, Landroidx/fragment/app/a0;->g(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/fragment/app/g0;->k()V

    goto :goto_1e

    :cond_26
    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    :cond_27
    iget v3, v0, Landroidx/fragment/app/a0;->s:I

    const/4 v6, 0x1

    invoke-virtual {v0, v3, v6}, Landroidx/fragment/app/a0;->P(IZ)V

    .line 26
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move/from16 v6, p3

    :goto_1f
    if-ge v6, v4, :cond_2a

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/a;

    iget-object v7, v7, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_28
    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_29

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/i0$a;

    iget-object v8, v8, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    if-eqz v8, :cond_28

    iget-object v8, v8, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    if-eqz v8, :cond_28

    .line 27
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/a0;->H()Landroidx/fragment/app/y0;

    move-result-object v9

    invoke-static {v8, v9}, Landroidx/fragment/app/v0;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/y0;)Landroidx/fragment/app/v0;

    move-result-object v8

    .line 28
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_29
    add-int/lit8 v6, v6, 0x1

    goto :goto_1f

    .line 29
    :cond_2a
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_21
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/v0;

    .line 30
    iput-boolean v1, v6, Landroidx/fragment/app/v0;->d:Z

    .line 31
    invoke-virtual {v6}, Landroidx/fragment/app/v0;->g()V

    invoke-virtual {v6}, Landroidx/fragment/app/v0;->c()V

    goto :goto_21

    :cond_2b
    move/from16 v1, p3

    :goto_22
    if-ge v1, v4, :cond_2d

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2c

    iget v6, v3, Landroidx/fragment/app/a;->r:I

    if-ltz v6, :cond_2c

    const/4 v6, -0x1

    iput v6, v3, Landroidx/fragment/app/a;->r:I

    goto :goto_23

    :cond_2c
    const/4 v6, -0x1

    .line 32
    :goto_23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x1

    goto :goto_22

    :cond_2d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final C(Ljava/lang/String;)Landroidx/fragment/app/o;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/h0;->c(Ljava/lang/String;)Landroidx/fragment/app/o;

    move-result-object p1

    return-object p1
.end method

.method public final D(I)Landroidx/fragment/app/o;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/fragment/app/o;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v4, v3, Landroidx/fragment/app/o;->w:I

    .line 24
    .line 25
    if-ne v4, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 29
    .line 30
    check-cast v0, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroidx/fragment/app/g0;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v3, v1, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 55
    .line 56
    iget v1, v3, Landroidx/fragment/app/o;->w:I

    .line 57
    .line 58
    if-ne v1, p1, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/4 v3, 0x0

    .line 62
    :goto_0
    return-object v3
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

.method public final E(Ljava/lang/String;)Landroidx/fragment/app/o;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/fragment/app/o;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Landroidx/fragment/app/o;->y:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 33
    .line 34
    check-cast v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Landroidx/fragment/app/g0;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v3, v1, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 59
    .line 60
    iget-object v1, v3, Landroidx/fragment/app/o;->y:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 v3, 0x0

    .line 70
    :goto_0
    return-object v3
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

.method public final F(Landroidx/fragment/app/o;)Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Landroidx/fragment/app/o;->x:I

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/a0;->u:Landroidx/activity/result/c;

    invoke-virtual {v0}, Landroidx/activity/result/c;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/a0;->u:Landroidx/activity/result/c;

    iget p1, p1, Landroidx/fragment/app/o;->x:I

    invoke-virtual {v0, p1}, Landroidx/activity/result/c;->u(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final G()Landroidx/fragment/app/v;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    invoke-virtual {v0}, Landroidx/fragment/app/a0;->G()Landroidx/fragment/app/v;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->x:Landroidx/fragment/app/a0$d;

    return-object v0
.end method

.method public final H()Landroidx/fragment/app/y0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    invoke-virtual {v0}, Landroidx/fragment/app/a0;->H()Landroidx/fragment/app/y0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->y:Landroidx/fragment/app/a0$e;

    return-object v0
.end method

.method public final I(Landroidx/fragment/app/o;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "hide: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/o;->z:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/o;->z:Z

    iget-boolean v1, p1, Landroidx/fragment/app/o;->J:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/o;->J:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->c0(Landroidx/fragment/app/o;)V

    :cond_1
    return-void
.end method

.method public final L()Z
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/o;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    invoke-virtual {v0}, Landroidx/fragment/app/o;->l()Landroidx/fragment/app/a0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/a0;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final O()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/a0;->E:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/a0;->F:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final P(IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string p2, "No activity"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 18
    .line 19
    iget p2, p0, Landroidx/fragment/app/a0;->s:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    iput p1, p0, Landroidx/fragment/app/a0;->s:I

    .line 25
    .line 26
    iget-object p1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 27
    .line 28
    iget-object p2, p1, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v1, p1, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroidx/fragment/app/o;

    .line 49
    .line 50
    check-cast v1, Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v0, v0, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Landroidx/fragment/app/g0;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/fragment/app/g0;->k()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    check-cast v1, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x0

    .line 81
    if-eqz v0, :cond_7

    .line 82
    .line 83
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroidx/fragment/app/g0;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/fragment/app/g0;->k()V

    .line 92
    .line 93
    .line 94
    iget-object v2, v0, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 95
    .line 96
    iget-boolean v3, v2, Landroidx/fragment/app/o;->m:Z

    .line 97
    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/fragment/app/o;->s()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_6

    .line 105
    .line 106
    const/4 v1, 0x1

    .line 107
    :cond_6
    if-eqz v1, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroidx/fragment/app/h0;->i(Landroidx/fragment/app/g0;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e0()V

    .line 114
    .line 115
    .line 116
    iget-boolean p1, p0, Landroidx/fragment/app/a0;->D:Z

    .line 117
    .line 118
    if-eqz p1, :cond_8

    .line 119
    .line 120
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 121
    .line 122
    if-eqz p1, :cond_8

    .line 123
    .line 124
    iget p2, p0, Landroidx/fragment/app/a0;->s:I

    .line 125
    .line 126
    const/4 v0, 0x7

    .line 127
    if-ne p2, v0, :cond_8

    .line 128
    .line 129
    invoke-virtual {p1}, Landroidx/fragment/app/w;->D()V

    .line 130
    .line 131
    .line 132
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->D:Z

    .line 133
    .line 134
    :cond_8
    return-void
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final Q()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/a0;->E:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/a0;->F:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 12
    .line 13
    iput-boolean v0, v1, Landroidx/fragment/app/d0;->i:Z

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroidx/fragment/app/o;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/fragment/app/a0;->Q()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return-void
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final R()Z
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/a0;->S(II)Z

    move-result v0

    return v0
.end method

.method public final S(II)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->z(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/fragment/app/a0;->y(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/fragment/app/o;->g()Landroidx/fragment/app/a0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroidx/fragment/app/a0;->R()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v2, v3, p1, p2}, Landroidx/fragment/app/a0;->T(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v1}, Landroidx/fragment/app/a0;->V(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->g0()V

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Landroidx/fragment/app/a0;->H:Z

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    iput-boolean v0, p0, Landroidx/fragment/app/a0;->H:Z

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e0()V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p2, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 67
    .line 68
    invoke-virtual {p2}, Landroidx/fragment/app/h0;->b()V

    .line 69
    .line 70
    .line 71
    return p1
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final T(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_a

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_5

    .line 21
    :cond_1
    if-gez p3, :cond_3

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    move v3, v1

    .line 26
    goto :goto_5

    .line 27
    :cond_2
    iget-object p3, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    add-int/2addr v3, p3

    .line 34
    goto :goto_5

    .line 35
    :cond_3
    iget-object v2, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v3

    .line 42
    :goto_1
    if-ltz v2, :cond_5

    .line 43
    .line 44
    iget-object v4, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Landroidx/fragment/app/a;

    .line 51
    .line 52
    if-ltz p3, :cond_4

    .line 53
    .line 54
    iget v4, v4, Landroidx/fragment/app/a;->r:I

    .line 55
    .line 56
    if-ne p3, v4, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    :goto_2
    if-gez v2, :cond_7

    .line 63
    .line 64
    :cond_6
    :goto_3
    move v3, v2

    .line 65
    goto :goto_5

    .line 66
    :cond_7
    if-eqz p4, :cond_8

    .line 67
    .line 68
    :goto_4
    if-lez v2, :cond_6

    .line 69
    .line 70
    iget-object p4, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 71
    .line 72
    add-int/lit8 v3, v2, -0x1

    .line 73
    .line 74
    invoke-virtual {p4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    check-cast p4, Landroidx/fragment/app/a;

    .line 79
    .line 80
    if-ltz p3, :cond_6

    .line 81
    .line 82
    iget p4, p4, Landroidx/fragment/app/a;->r:I

    .line 83
    .line 84
    if-ne p3, p4, :cond_6

    .line 85
    .line 86
    move v2, v3

    .line 87
    goto :goto_4

    .line 88
    :cond_8
    iget-object p3, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    add-int/2addr p3, v3

    .line 95
    if-ne v2, p3, :cond_9

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_a
    :goto_5
    if-gez v3, :cond_b

    .line 102
    .line 103
    return v1

    .line 104
    :cond_b
    iget-object p3, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    sub-int/2addr p3, v0

    .line 111
    :goto_6
    if-lt p3, v3, :cond_c

    .line 112
    .line 113
    iget-object p4, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    check-cast p4, Landroidx/fragment/app/a;

    .line 120
    .line 121
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 p3, p3, -0x1

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_c
    return v0
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public final U(Landroidx/fragment/app/o;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "remove: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " nesting="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p1, Landroidx/fragment/app/o;->r:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "FragmentManager"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/o;->s()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    xor-int/2addr v0, v1

    .line 43
    iget-boolean v2, p1, Landroidx/fragment/app/o;->A:Z

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 50
    .line 51
    iget-object v2, v0, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v2

    .line 56
    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, Landroidx/fragment/app/o;->l:Z

    .line 66
    .line 67
    invoke-static {p1}, Landroidx/fragment/app/a0;->K(Landroidx/fragment/app/o;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->D:Z

    .line 74
    .line 75
    :cond_2
    iput-boolean v1, p1, Landroidx/fragment/app/o;->m:Z

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->c0(Landroidx/fragment/app/o;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw p1
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

.method public final V(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/i0;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/a0;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/i0;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/a0;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/a0;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final W(Landroid/os/Parcelable;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "result_"

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iget-object v5, v0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 42
    .line 43
    iget-object v5, v5, Landroidx/fragment/app/w;->d:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x7

    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v5, v0, Landroidx/fragment/app/a0;->k:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-string v5, "state"

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    const-string v6, "fragment_"

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget-object v6, v0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 105
    .line 106
    iget-object v6, v6, Landroidx/fragment/app/w;->d:Landroid/content/Context;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Landroidx/fragment/app/f0;

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iget-object v3, v0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 126
    .line 127
    iget-object v4, v3, Landroidx/fragment/app/h0;->c:Ljava/lang/Cloneable;

    .line 128
    .line 129
    check-cast v4, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_4

    .line 143
    .line 144
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, Landroidx/fragment/app/f0;

    .line 149
    .line 150
    iget-object v7, v6, Landroidx/fragment/app/f0;->c:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Landroidx/fragment/app/c0;

    .line 161
    .line 162
    if-nez v1, :cond_5

    .line 163
    .line 164
    return-void

    .line 165
    :cond_5
    iget-object v2, v3, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 166
    .line 167
    move-object v4, v2

    .line 168
    check-cast v4, Ljava/util/HashMap;

    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 171
    .line 172
    .line 173
    iget-object v4, v1, Landroidx/fragment/app/c0;->b:Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    iget-object v6, v0, Landroidx/fragment/app/a0;->l:Landroidx/fragment/app/y;

    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    const-string v8, "): "

    .line 187
    .line 188
    const/4 v9, 0x2

    .line 189
    const-string v10, "FragmentManager"

    .line 190
    .line 191
    if-eqz v5, :cond_a

    .line 192
    .line 193
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    check-cast v5, Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v3, v5, v7}, Landroidx/fragment/app/h0;->j(Ljava/lang/String;Landroidx/fragment/app/f0;)Landroidx/fragment/app/f0;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    if-eqz v5, :cond_6

    .line 204
    .line 205
    iget-object v7, v0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 206
    .line 207
    iget-object v7, v7, Landroidx/fragment/app/d0;->d:Ljava/util/HashMap;

    .line 208
    .line 209
    iget-object v11, v5, Landroidx/fragment/app/f0;->c:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v7, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    check-cast v7, Landroidx/fragment/app/o;

    .line 216
    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    invoke-static {v9}, Landroidx/fragment/app/a0;->J(I)Z

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    if-eqz v11, :cond_7

    .line 224
    .line 225
    new-instance v11, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v12, "restoreSaveState: re-attaching retained "

    .line 228
    .line 229
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    :cond_7
    new-instance v11, Landroidx/fragment/app/g0;

    .line 243
    .line 244
    invoke-direct {v11, v6, v3, v7, v5}, Landroidx/fragment/app/g0;-><init>(Landroidx/fragment/app/y;Landroidx/fragment/app/h0;Landroidx/fragment/app/o;Landroidx/fragment/app/f0;)V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_8
    new-instance v6, Landroidx/fragment/app/g0;

    .line 249
    .line 250
    iget-object v12, v0, Landroidx/fragment/app/a0;->l:Landroidx/fragment/app/y;

    .line 251
    .line 252
    iget-object v13, v0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 253
    .line 254
    iget-object v7, v0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 255
    .line 256
    iget-object v7, v7, Landroidx/fragment/app/w;->d:Landroid/content/Context;

    .line 257
    .line 258
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/a0;->G()Landroidx/fragment/app/v;

    .line 263
    .line 264
    .line 265
    move-result-object v15

    .line 266
    move-object v11, v6

    .line 267
    move-object/from16 v16, v5

    .line 268
    .line 269
    invoke-direct/range {v11 .. v16}, Landroidx/fragment/app/g0;-><init>(Landroidx/fragment/app/y;Landroidx/fragment/app/h0;Ljava/lang/ClassLoader;Landroidx/fragment/app/v;Landroidx/fragment/app/f0;)V

    .line 270
    .line 271
    .line 272
    :goto_4
    iget-object v5, v11, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 273
    .line 274
    iput-object v0, v5, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 275
    .line 276
    invoke-static {v9}, Landroidx/fragment/app/a0;->J(I)Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_9

    .line 281
    .line 282
    new-instance v6, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v7, "restoreSaveState: active ("

    .line 285
    .line 286
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    iget-object v7, v5, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    :cond_9
    iget-object v5, v0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 308
    .line 309
    iget-object v5, v5, Landroidx/fragment/app/w;->d:Landroid/content/Context;

    .line 310
    .line 311
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-virtual {v11, v5}, Landroidx/fragment/app/g0;->m(Ljava/lang/ClassLoader;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v11}, Landroidx/fragment/app/h0;->h(Landroidx/fragment/app/g0;)V

    .line 319
    .line 320
    .line 321
    iget v5, v0, Landroidx/fragment/app/a0;->s:I

    .line 322
    .line 323
    iput v5, v11, Landroidx/fragment/app/g0;->e:I

    .line 324
    .line 325
    goto/16 :goto_3

    .line 326
    .line 327
    :cond_a
    iget-object v4, v0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    new-instance v5, Ljava/util/ArrayList;

    .line 333
    .line 334
    iget-object v4, v4, Landroidx/fragment/app/d0;->d:Ljava/util/HashMap;

    .line 335
    .line 336
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    :cond_b
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    const/4 v11, 0x0

    .line 352
    const/4 v12, 0x1

    .line 353
    if-eqz v5, :cond_e

    .line 354
    .line 355
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    check-cast v5, Landroidx/fragment/app/o;

    .line 360
    .line 361
    iget-object v13, v5, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 362
    .line 363
    move-object v14, v2

    .line 364
    check-cast v14, Ljava/util/HashMap;

    .line 365
    .line 366
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v13

    .line 370
    if-eqz v13, :cond_c

    .line 371
    .line 372
    move v11, v12

    .line 373
    :cond_c
    if-nez v11, :cond_b

    .line 374
    .line 375
    invoke-static {v9}, Landroidx/fragment/app/a0;->J(I)Z

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    if-eqz v11, :cond_d

    .line 380
    .line 381
    new-instance v11, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    const-string v13, "Discarding retained Fragment "

    .line 384
    .line 385
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    const-string v13, " that was not found in the set of active Fragments "

    .line 392
    .line 393
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    iget-object v13, v1, Landroidx/fragment/app/c0;->b:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v11

    .line 405
    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 406
    .line 407
    .line 408
    :cond_d
    iget-object v11, v0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 409
    .line 410
    invoke-virtual {v11, v5}, Landroidx/fragment/app/d0;->f(Landroidx/fragment/app/o;)V

    .line 411
    .line 412
    .line 413
    iput-object v0, v5, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 414
    .line 415
    new-instance v11, Landroidx/fragment/app/g0;

    .line 416
    .line 417
    invoke-direct {v11, v6, v3, v5}, Landroidx/fragment/app/g0;-><init>(Landroidx/fragment/app/y;Landroidx/fragment/app/h0;Landroidx/fragment/app/o;)V

    .line 418
    .line 419
    .line 420
    iput v12, v11, Landroidx/fragment/app/g0;->e:I

    .line 421
    .line 422
    invoke-virtual {v11}, Landroidx/fragment/app/g0;->k()V

    .line 423
    .line 424
    .line 425
    iput-boolean v12, v5, Landroidx/fragment/app/o;->m:Z

    .line 426
    .line 427
    invoke-virtual {v11}, Landroidx/fragment/app/g0;->k()V

    .line 428
    .line 429
    .line 430
    goto :goto_5

    .line 431
    :cond_e
    iget-object v2, v1, Landroidx/fragment/app/c0;->c:Ljava/util/ArrayList;

    .line 432
    .line 433
    iget-object v4, v3, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v4, Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 438
    .line 439
    .line 440
    if-eqz v2, :cond_11

    .line 441
    .line 442
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    if-eqz v4, :cond_11

    .line 451
    .line 452
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    check-cast v4, Ljava/lang/String;

    .line 457
    .line 458
    invoke-virtual {v3, v4}, Landroidx/fragment/app/h0;->c(Ljava/lang/String;)Landroidx/fragment/app/o;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    if-eqz v5, :cond_10

    .line 463
    .line 464
    invoke-static {v9}, Landroidx/fragment/app/a0;->J(I)Z

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    if-eqz v6, :cond_f

    .line 469
    .line 470
    new-instance v6, Ljava/lang/StringBuilder;

    .line 471
    .line 472
    const-string v13, "restoreSaveState: added ("

    .line 473
    .line 474
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-static {v10, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 491
    .line 492
    .line 493
    :cond_f
    invoke-virtual {v3, v5}, Landroidx/fragment/app/h0;->a(Landroidx/fragment/app/o;)V

    .line 494
    .line 495
    .line 496
    goto :goto_6

    .line 497
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 498
    .line 499
    const-string v2, "No instantiated fragment for ("

    .line 500
    .line 501
    const-string v3, ")"

    .line 502
    .line 503
    invoke-static {v2, v4, v3}, Lb5/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    throw v1

    .line 511
    :cond_11
    iget-object v2, v1, Landroidx/fragment/app/c0;->d:[Landroidx/fragment/app/b;

    .line 512
    .line 513
    if-eqz v2, :cond_18

    .line 514
    .line 515
    new-instance v2, Ljava/util/ArrayList;

    .line 516
    .line 517
    iget-object v3, v1, Landroidx/fragment/app/c0;->d:[Landroidx/fragment/app/b;

    .line 518
    .line 519
    array-length v3, v3

    .line 520
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 521
    .line 522
    .line 523
    iput-object v2, v0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 524
    .line 525
    move v2, v11

    .line 526
    :goto_7
    iget-object v3, v1, Landroidx/fragment/app/c0;->d:[Landroidx/fragment/app/b;

    .line 527
    .line 528
    array-length v4, v3

    .line 529
    if-ge v2, v4, :cond_19

    .line 530
    .line 531
    aget-object v3, v3, v2

    .line 532
    .line 533
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    new-instance v4, Landroidx/fragment/app/a;

    .line 537
    .line 538
    invoke-direct {v4, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/a0;)V

    .line 539
    .line 540
    .line 541
    move v5, v11

    .line 542
    move v6, v5

    .line 543
    :goto_8
    iget-object v7, v3, Landroidx/fragment/app/b;->b:[I

    .line 544
    .line 545
    array-length v13, v7

    .line 546
    if-ge v5, v13, :cond_14

    .line 547
    .line 548
    new-instance v13, Landroidx/fragment/app/i0$a;

    .line 549
    .line 550
    invoke-direct {v13}, Landroidx/fragment/app/i0$a;-><init>()V

    .line 551
    .line 552
    .line 553
    add-int/lit8 v14, v5, 0x1

    .line 554
    .line 555
    aget v5, v7, v5

    .line 556
    .line 557
    iput v5, v13, Landroidx/fragment/app/i0$a;->a:I

    .line 558
    .line 559
    invoke-static {v9}, Landroidx/fragment/app/a0;->J(I)Z

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    if-eqz v5, :cond_12

    .line 564
    .line 565
    new-instance v5, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    const-string v15, "Instantiate "

    .line 568
    .line 569
    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    const-string v15, " op #"

    .line 576
    .line 577
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    const-string v15, " base fragment #"

    .line 584
    .line 585
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    aget v15, v7, v14

    .line 589
    .line 590
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 598
    .line 599
    .line 600
    :cond_12
    invoke-static {}, Landroidx/lifecycle/j$c;->values()[Landroidx/lifecycle/j$c;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    iget-object v15, v3, Landroidx/fragment/app/b;->d:[I

    .line 605
    .line 606
    aget v15, v15, v6

    .line 607
    .line 608
    aget-object v5, v5, v15

    .line 609
    .line 610
    iput-object v5, v13, Landroidx/fragment/app/i0$a;->h:Landroidx/lifecycle/j$c;

    .line 611
    .line 612
    invoke-static {}, Landroidx/lifecycle/j$c;->values()[Landroidx/lifecycle/j$c;

    .line 613
    .line 614
    .line 615
    move-result-object v5

    .line 616
    iget-object v15, v3, Landroidx/fragment/app/b;->e:[I

    .line 617
    .line 618
    aget v15, v15, v6

    .line 619
    .line 620
    aget-object v5, v5, v15

    .line 621
    .line 622
    iput-object v5, v13, Landroidx/fragment/app/i0$a;->i:Landroidx/lifecycle/j$c;

    .line 623
    .line 624
    add-int/lit8 v5, v14, 0x1

    .line 625
    .line 626
    aget v14, v7, v14

    .line 627
    .line 628
    if-eqz v14, :cond_13

    .line 629
    .line 630
    move v14, v12

    .line 631
    goto :goto_9

    .line 632
    :cond_13
    move v14, v11

    .line 633
    :goto_9
    iput-boolean v14, v13, Landroidx/fragment/app/i0$a;->c:Z

    .line 634
    .line 635
    add-int/lit8 v14, v5, 0x1

    .line 636
    .line 637
    aget v5, v7, v5

    .line 638
    .line 639
    iput v5, v13, Landroidx/fragment/app/i0$a;->d:I

    .line 640
    .line 641
    add-int/lit8 v15, v14, 0x1

    .line 642
    .line 643
    aget v14, v7, v14

    .line 644
    .line 645
    iput v14, v13, Landroidx/fragment/app/i0$a;->e:I

    .line 646
    .line 647
    add-int/lit8 v16, v15, 0x1

    .line 648
    .line 649
    aget v15, v7, v15

    .line 650
    .line 651
    iput v15, v13, Landroidx/fragment/app/i0$a;->f:I

    .line 652
    .line 653
    add-int/lit8 v17, v16, 0x1

    .line 654
    .line 655
    aget v7, v7, v16

    .line 656
    .line 657
    iput v7, v13, Landroidx/fragment/app/i0$a;->g:I

    .line 658
    .line 659
    iput v5, v4, Landroidx/fragment/app/i0;->b:I

    .line 660
    .line 661
    iput v14, v4, Landroidx/fragment/app/i0;->c:I

    .line 662
    .line 663
    iput v15, v4, Landroidx/fragment/app/i0;->d:I

    .line 664
    .line 665
    iput v7, v4, Landroidx/fragment/app/i0;->e:I

    .line 666
    .line 667
    invoke-virtual {v4, v13}, Landroidx/fragment/app/i0;->b(Landroidx/fragment/app/i0$a;)V

    .line 668
    .line 669
    .line 670
    add-int/lit8 v6, v6, 0x1

    .line 671
    .line 672
    move/from16 v5, v17

    .line 673
    .line 674
    goto/16 :goto_8

    .line 675
    .line 676
    :cond_14
    iget v5, v3, Landroidx/fragment/app/b;->f:I

    .line 677
    .line 678
    iput v5, v4, Landroidx/fragment/app/i0;->f:I

    .line 679
    .line 680
    iget-object v5, v3, Landroidx/fragment/app/b;->g:Ljava/lang/String;

    .line 681
    .line 682
    iput-object v5, v4, Landroidx/fragment/app/i0;->h:Ljava/lang/String;

    .line 683
    .line 684
    iput-boolean v12, v4, Landroidx/fragment/app/i0;->g:Z

    .line 685
    .line 686
    iget v5, v3, Landroidx/fragment/app/b;->i:I

    .line 687
    .line 688
    iput v5, v4, Landroidx/fragment/app/i0;->i:I

    .line 689
    .line 690
    iget-object v5, v3, Landroidx/fragment/app/b;->j:Ljava/lang/CharSequence;

    .line 691
    .line 692
    iput-object v5, v4, Landroidx/fragment/app/i0;->j:Ljava/lang/CharSequence;

    .line 693
    .line 694
    iget v5, v3, Landroidx/fragment/app/b;->k:I

    .line 695
    .line 696
    iput v5, v4, Landroidx/fragment/app/i0;->k:I

    .line 697
    .line 698
    iget-object v5, v3, Landroidx/fragment/app/b;->l:Ljava/lang/CharSequence;

    .line 699
    .line 700
    iput-object v5, v4, Landroidx/fragment/app/i0;->l:Ljava/lang/CharSequence;

    .line 701
    .line 702
    iget-object v5, v3, Landroidx/fragment/app/b;->m:Ljava/util/ArrayList;

    .line 703
    .line 704
    iput-object v5, v4, Landroidx/fragment/app/i0;->m:Ljava/util/ArrayList;

    .line 705
    .line 706
    iget-object v5, v3, Landroidx/fragment/app/b;->n:Ljava/util/ArrayList;

    .line 707
    .line 708
    iput-object v5, v4, Landroidx/fragment/app/i0;->n:Ljava/util/ArrayList;

    .line 709
    .line 710
    iget-boolean v5, v3, Landroidx/fragment/app/b;->o:Z

    .line 711
    .line 712
    iput-boolean v5, v4, Landroidx/fragment/app/i0;->o:Z

    .line 713
    .line 714
    iget v5, v3, Landroidx/fragment/app/b;->h:I

    .line 715
    .line 716
    iput v5, v4, Landroidx/fragment/app/a;->r:I

    .line 717
    .line 718
    move v5, v11

    .line 719
    :goto_a
    iget-object v6, v3, Landroidx/fragment/app/b;->c:Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 722
    .line 723
    .line 724
    move-result v7

    .line 725
    if-ge v5, v7, :cond_16

    .line 726
    .line 727
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v6

    .line 731
    check-cast v6, Ljava/lang/String;

    .line 732
    .line 733
    if-eqz v6, :cond_15

    .line 734
    .line 735
    iget-object v7, v4, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    .line 736
    .line 737
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v7

    .line 741
    check-cast v7, Landroidx/fragment/app/i0$a;

    .line 742
    .line 743
    invoke-virtual {v0, v6}, Landroidx/fragment/app/a0;->C(Ljava/lang/String;)Landroidx/fragment/app/o;

    .line 744
    .line 745
    .line 746
    move-result-object v6

    .line 747
    iput-object v6, v7, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    .line 748
    .line 749
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 750
    .line 751
    goto :goto_a

    .line 752
    :cond_16
    invoke-virtual {v4, v12}, Landroidx/fragment/app/a;->c(I)V

    .line 753
    .line 754
    .line 755
    invoke-static {v9}, Landroidx/fragment/app/a0;->J(I)Z

    .line 756
    .line 757
    .line 758
    move-result v3

    .line 759
    if-eqz v3, :cond_17

    .line 760
    .line 761
    new-instance v3, Ljava/lang/StringBuilder;

    .line 762
    .line 763
    const-string v5, "restoreAllState: back stack #"

    .line 764
    .line 765
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    const-string v5, " (index "

    .line 772
    .line 773
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    iget v5, v4, Landroidx/fragment/app/a;->r:I

    .line 777
    .line 778
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    invoke-static {v10, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 792
    .line 793
    .line 794
    new-instance v3, Landroidx/fragment/app/s0;

    .line 795
    .line 796
    invoke-direct {v3}, Landroidx/fragment/app/s0;-><init>()V

    .line 797
    .line 798
    .line 799
    new-instance v5, Ljava/io/PrintWriter;

    .line 800
    .line 801
    invoke-direct {v5, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 802
    .line 803
    .line 804
    const-string v3, "  "

    .line 805
    .line 806
    invoke-virtual {v4, v3, v5, v11}, Landroidx/fragment/app/a;->g(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 810
    .line 811
    .line 812
    :cond_17
    iget-object v3, v0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    add-int/lit8 v2, v2, 0x1

    .line 818
    .line 819
    goto/16 :goto_7

    .line 820
    .line 821
    :cond_18
    iput-object v7, v0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 822
    .line 823
    :cond_19
    iget-object v2, v0, Landroidx/fragment/app/a0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 824
    .line 825
    iget v3, v1, Landroidx/fragment/app/c0;->e:I

    .line 826
    .line 827
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 828
    .line 829
    .line 830
    iget-object v2, v1, Landroidx/fragment/app/c0;->f:Ljava/lang/String;

    .line 831
    .line 832
    if-eqz v2, :cond_1a

    .line 833
    .line 834
    invoke-virtual {v0, v2}, Landroidx/fragment/app/a0;->C(Ljava/lang/String;)Landroidx/fragment/app/o;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    iput-object v2, v0, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    .line 839
    .line 840
    invoke-virtual {v0, v2}, Landroidx/fragment/app/a0;->r(Landroidx/fragment/app/o;)V

    .line 841
    .line 842
    .line 843
    :cond_1a
    iget-object v2, v1, Landroidx/fragment/app/c0;->g:Ljava/util/ArrayList;

    .line 844
    .line 845
    if-eqz v2, :cond_1b

    .line 846
    .line 847
    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 848
    .line 849
    .line 850
    move-result v3

    .line 851
    if-ge v11, v3, :cond_1b

    .line 852
    .line 853
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    check-cast v3, Ljava/lang/String;

    .line 858
    .line 859
    iget-object v4, v1, Landroidx/fragment/app/c0;->h:Ljava/util/ArrayList;

    .line 860
    .line 861
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    check-cast v4, Landroidx/fragment/app/c;

    .line 866
    .line 867
    iget-object v5, v0, Landroidx/fragment/app/a0;->j:Ljava/util/Map;

    .line 868
    .line 869
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    add-int/lit8 v11, v11, 0x1

    .line 873
    .line 874
    goto :goto_b

    .line 875
    :cond_1b
    new-instance v2, Ljava/util/ArrayDeque;

    .line 876
    .line 877
    iget-object v1, v1, Landroidx/fragment/app/c0;->i:Ljava/util/ArrayList;

    .line 878
    .line 879
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 880
    .line 881
    .line 882
    iput-object v2, v0, Landroidx/fragment/app/a0;->C:Ljava/util/ArrayDeque;

    .line 883
    .line 884
    return-void
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final X()Landroid/os/Bundle;
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->f()Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/v0;

    .line 27
    .line 28
    iget-boolean v5, v2, Landroidx/fragment/app/v0;->e:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, Landroidx/fragment/app/a0;->J(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    const-string v4, "FragmentManager"

    .line 39
    .line 40
    const-string v5, "SpecialEffectsController: Forcing postponed operations"

    .line 41
    .line 42
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-boolean v3, v2, Landroidx/fragment/app/v0;->e:Z

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/fragment/app/v0;->c()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->w()V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-virtual {p0, v1}, Landroidx/fragment/app/a0;->z(Z)Z

    .line 56
    .line 57
    .line 58
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->E:Z

    .line 59
    .line 60
    iget-object v2, p0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 61
    .line 62
    iput-boolean v1, v2, Landroidx/fragment/app/d0;->i:Z

    .line 63
    .line 64
    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v2, Ljava/util/ArrayList;

    .line 70
    .line 71
    iget-object v1, v1, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 72
    .line 73
    check-cast v1, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Landroidx/fragment/app/g0;

    .line 101
    .line 102
    if-eqz v5, :cond_3

    .line 103
    .line 104
    invoke-virtual {v5}, Landroidx/fragment/app/g0;->p()V

    .line 105
    .line 106
    .line 107
    iget-object v5, v5, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 108
    .line 109
    iget-object v6, v5, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    invoke-static {v4}, Landroidx/fragment/app/a0;->J(I)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_3

    .line 119
    .line 120
    new-instance v6, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v7, "Saved state of "

    .line 123
    .line 124
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v7, ": "

    .line 131
    .line 132
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v5, v5, Landroidx/fragment/app/o;->c:Landroid/os/Bundle;

    .line 136
    .line 137
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const-string v6, "FragmentManager"

    .line 145
    .line 146
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_4
    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance v5, Ljava/util/ArrayList;

    .line 156
    .line 157
    iget-object v1, v1, Landroidx/fragment/app/h0;->c:Ljava/lang/Cloneable;

    .line 158
    .line 159
    check-cast v1, Ljava/util/HashMap;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_5

    .line 173
    .line 174
    invoke-static {v4}, Landroidx/fragment/app/a0;->J(I)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_d

    .line 179
    .line 180
    const-string v1, "FragmentManager"

    .line 181
    .line 182
    const-string v2, "saveAllState: no fragments!"

    .line 183
    .line 184
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    goto/16 :goto_7

    .line 188
    .line 189
    :cond_5
    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 190
    .line 191
    iget-object v6, v1, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v6, Ljava/util/ArrayList;

    .line 194
    .line 195
    monitor-enter v6

    .line 196
    :try_start_0
    iget-object v7, v1, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v7, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    const/4 v8, 0x0

    .line 205
    if-eqz v7, :cond_6

    .line 206
    .line 207
    monitor-exit v6

    .line 208
    move-object v7, v8

    .line 209
    goto :goto_3

    .line 210
    :cond_6
    new-instance v7, Ljava/util/ArrayList;

    .line 211
    .line 212
    iget-object v9, v1, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v9, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 221
    .line 222
    .line 223
    iget-object v1, v1, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_8

    .line 236
    .line 237
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    check-cast v9, Landroidx/fragment/app/o;

    .line 242
    .line 243
    iget-object v10, v9, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    invoke-static {v4}, Landroidx/fragment/app/a0;->J(I)Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    if-eqz v10, :cond_7

    .line 253
    .line 254
    const-string v10, "FragmentManager"

    .line 255
    .line 256
    new-instance v11, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v12, "saveAllState: adding fragment ("

    .line 262
    .line 263
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    iget-object v12, v9, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v12, "): "

    .line 272
    .line 273
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    invoke-static {v10, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_8
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    :goto_3
    iget-object v1, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 289
    .line 290
    if-eqz v1, :cond_a

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-lez v1, :cond_a

    .line 297
    .line 298
    new-array v8, v1, [Landroidx/fragment/app/b;

    .line 299
    .line 300
    :goto_4
    if-ge v3, v1, :cond_a

    .line 301
    .line 302
    new-instance v6, Landroidx/fragment/app/b;

    .line 303
    .line 304
    iget-object v9, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    check-cast v9, Landroidx/fragment/app/a;

    .line 311
    .line 312
    invoke-direct {v6, v9}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    .line 313
    .line 314
    .line 315
    aput-object v6, v8, v3

    .line 316
    .line 317
    invoke-static {v4}, Landroidx/fragment/app/a0;->J(I)Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    if-eqz v6, :cond_9

    .line 322
    .line 323
    const-string v6, "FragmentManager"

    .line 324
    .line 325
    new-instance v9, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v10, "saveAllState: adding back stack #"

    .line 328
    .line 329
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v10, ": "

    .line 336
    .line 337
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    iget-object v10, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-static {v6, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    .line 355
    .line 356
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_a
    new-instance v1, Landroidx/fragment/app/c0;

    .line 360
    .line 361
    invoke-direct {v1}, Landroidx/fragment/app/c0;-><init>()V

    .line 362
    .line 363
    .line 364
    iput-object v2, v1, Landroidx/fragment/app/c0;->b:Ljava/util/ArrayList;

    .line 365
    .line 366
    iput-object v7, v1, Landroidx/fragment/app/c0;->c:Ljava/util/ArrayList;

    .line 367
    .line 368
    iput-object v8, v1, Landroidx/fragment/app/c0;->d:[Landroidx/fragment/app/b;

    .line 369
    .line 370
    iget-object v2, p0, Landroidx/fragment/app/a0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    iput v2, v1, Landroidx/fragment/app/c0;->e:I

    .line 377
    .line 378
    iget-object v2, p0, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    .line 379
    .line 380
    if-eqz v2, :cond_b

    .line 381
    .line 382
    iget-object v2, v2, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 383
    .line 384
    iput-object v2, v1, Landroidx/fragment/app/c0;->f:Ljava/lang/String;

    .line 385
    .line 386
    :cond_b
    iget-object v2, v1, Landroidx/fragment/app/c0;->g:Ljava/util/ArrayList;

    .line 387
    .line 388
    iget-object v3, p0, Landroidx/fragment/app/a0;->j:Ljava/util/Map;

    .line 389
    .line 390
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 395
    .line 396
    .line 397
    iget-object v2, v1, Landroidx/fragment/app/c0;->h:Ljava/util/ArrayList;

    .line 398
    .line 399
    iget-object v3, p0, Landroidx/fragment/app/a0;->j:Ljava/util/Map;

    .line 400
    .line 401
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 406
    .line 407
    .line 408
    new-instance v2, Ljava/util/ArrayList;

    .line 409
    .line 410
    iget-object v3, p0, Landroidx/fragment/app/a0;->C:Ljava/util/ArrayDeque;

    .line 411
    .line 412
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 413
    .line 414
    .line 415
    iput-object v2, v1, Landroidx/fragment/app/c0;->i:Ljava/util/ArrayList;

    .line 416
    .line 417
    const-string v2, "state"

    .line 418
    .line 419
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 420
    .line 421
    .line 422
    iget-object v1, p0, Landroidx/fragment/app/a0;->k:Ljava/util/Map;

    .line 423
    .line 424
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_c

    .line 437
    .line 438
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    check-cast v2, Ljava/lang/String;

    .line 443
    .line 444
    new-instance v3, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    const-string v4, "result_"

    .line 447
    .line 448
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    iget-object v4, p0, Landroidx/fragment/app/a0;->k:Ljava/util/Map;

    .line 459
    .line 460
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, Landroid/os/Bundle;

    .line 465
    .line 466
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 467
    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_d

    .line 479
    .line 480
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    check-cast v2, Landroidx/fragment/app/f0;

    .line 485
    .line 486
    new-instance v3, Landroid/os/Bundle;

    .line 487
    .line 488
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 489
    .line 490
    .line 491
    const-string v4, "state"

    .line 492
    .line 493
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 494
    .line 495
    .line 496
    new-instance v4, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    const-string v5, "fragment_"

    .line 499
    .line 500
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    iget-object v2, v2, Landroidx/fragment/app/f0;->c:Ljava/lang/String;

    .line 504
    .line 505
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 513
    .line 514
    .line 515
    goto :goto_6

    .line 516
    :cond_d
    :goto_7
    return-object v0

    .line 517
    :catchall_0
    move-exception v0

    .line 518
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 519
    throw v0
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
.end method

.method public final Y()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 18
    .line 19
    iget-object v1, v1, Landroidx/fragment/app/w;->e:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/fragment/app/a0;->M:Landroidx/fragment/app/a0$f;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/fragment/app/w;->e:Landroid/os/Handler;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/fragment/app/a0;->M:Landroidx/fragment/app/a0$f;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->g0()V

    .line 36
    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw v1
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final Z(Landroidx/fragment/app/o;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->F(Landroidx/fragment/app/o;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final a(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/o;->L:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ls0/b;->d(Landroidx/fragment/app/o;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "add: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->g(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;

    move-result-object v0

    iput-object p0, p1, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/h0;->h(Landroidx/fragment/app/g0;)V

    iget-boolean v2, p1, Landroidx/fragment/app/o;->A:Z

    if-nez v2, :cond_3

    invoke-virtual {v1, p1}, Landroidx/fragment/app/h0;->a(Landroidx/fragment/app/o;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/o;->m:Z

    iget-object v2, p1, Landroidx/fragment/app/o;->F:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Landroidx/fragment/app/o;->J:Z

    :cond_2
    invoke-static {p1}, Landroidx/fragment/app/a0;->K(Landroidx/fragment/app/o;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/a0;->D:Z

    :cond_3
    return-object v0
.end method

.method public final a0(Landroidx/fragment/app/o;Landroidx/lifecycle/j$c;)V
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->C(Ljava/lang/String;)Landroidx/fragment/app/o;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/o;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/o;->t:Landroidx/fragment/app/w;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/o;->M:Landroidx/lifecycle/j$c;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final b(Landroidx/fragment/app/e0;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b0(Landroidx/fragment/app/o;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->C(Ljava/lang/String;)Landroidx/fragment/app/o;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/o;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/o;->t:Landroidx/fragment/app/w;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    iput-object p1, p0, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->r(Landroidx/fragment/app/o;)V

    iget-object p1, p0, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->r(Landroidx/fragment/app/o;)V

    return-void
.end method

.method public final c(Landroidx/fragment/app/w;Landroidx/activity/result/c;Landroidx/fragment/app/o;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/w<",
            "*>;",
            "Landroidx/activity/result/c;",
            "Landroidx/fragment/app/o;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/fragment/app/a0;->u:Landroidx/activity/result/c;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    new-instance p2, Landroidx/fragment/app/a0$g;

    .line 14
    .line 15
    invoke-direct {p2, p3}, Landroidx/fragment/app/a0$g;-><init>(Landroidx/fragment/app/o;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    instance-of p2, p1, Landroidx/fragment/app/e0;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    move-object p2, p1

    .line 24
    check-cast p2, Landroidx/fragment/app/e0;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0, p2}, Landroidx/fragment/app/a0;->b(Landroidx/fragment/app/e0;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p2, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->g0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    instance-of p2, p1, Landroidx/activity/i;

    .line 37
    .line 38
    if-eqz p2, :cond_4

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    check-cast p2, Landroidx/activity/i;

    .line 42
    .line 43
    invoke-interface {p2}, Landroidx/activity/i;->a()Landroidx/activity/OnBackPressedDispatcher;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Landroidx/fragment/app/a0;->g:Landroidx/activity/OnBackPressedDispatcher;

    .line 48
    .line 49
    if-eqz p3, :cond_3

    .line 50
    .line 51
    move-object p2, p3

    .line 52
    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/a0;->h:Landroidx/fragment/app/a0$b;

    .line 53
    .line 54
    invoke-virtual {v0, p2, v1}, Landroidx/activity/OnBackPressedDispatcher;->a(Landroidx/lifecycle/o;Landroidx/fragment/app/a0$b;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object p1, p3, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 60
    .line 61
    iget-object p1, p1, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 62
    .line 63
    iget-object p2, p1, Landroidx/fragment/app/d0;->e:Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v0, p3, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroidx/fragment/app/d0;

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    new-instance v0, Landroidx/fragment/app/d0;

    .line 76
    .line 77
    iget-boolean p1, p1, Landroidx/fragment/app/d0;->g:Z

    .line 78
    .line 79
    invoke-direct {v0, p1}, Landroidx/fragment/app/d0;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p3, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iput-object v0, p0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    instance-of p2, p1, Landroidx/lifecycle/l0;

    .line 91
    .line 92
    if-eqz p2, :cond_7

    .line 93
    .line 94
    check-cast p1, Landroidx/lifecycle/l0;

    .line 95
    .line 96
    invoke-interface {p1}, Landroidx/lifecycle/l0;->t()Landroidx/lifecycle/k0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance p2, Landroidx/lifecycle/i0;

    .line 101
    .line 102
    sget-object v0, Landroidx/fragment/app/d0;->j:Landroidx/fragment/app/d0$a;

    .line 103
    .line 104
    invoke-direct {p2, p1, v0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$b;)V

    .line 105
    .line 106
    .line 107
    const-class p1, Landroidx/fragment/app/d0;

    .line 108
    .line 109
    invoke-virtual {p2, p1}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Landroidx/fragment/app/d0;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_7
    new-instance p1, Landroidx/fragment/app/d0;

    .line 117
    .line 118
    const/4 p2, 0x0

    .line 119
    invoke-direct {p1, p2}, Landroidx/fragment/app/d0;-><init>(Z)V

    .line 120
    .line 121
    .line 122
    :goto_1
    iput-object p1, p0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 123
    .line 124
    :goto_2
    iget-object p1, p0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 125
    .line 126
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->O()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    iput-boolean p2, p1, Landroidx/fragment/app/d0;->i:Z

    .line 131
    .line 132
    iget-object p1, p0, Landroidx/fragment/app/a0;->L:Landroidx/fragment/app/d0;

    .line 133
    .line 134
    iget-object p2, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 135
    .line 136
    iput-object p1, p2, Landroidx/fragment/app/h0;->d:Ljava/lang/Object;

    .line 137
    .line 138
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 139
    .line 140
    instance-of p2, p1, Lx0/d;

    .line 141
    .line 142
    if-eqz p2, :cond_8

    .line 143
    .line 144
    if-nez p3, :cond_8

    .line 145
    .line 146
    check-cast p1, Lx0/d;

    .line 147
    .line 148
    invoke-interface {p1}, Lx0/d;->b()Lx0/b;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    new-instance p2, Landroidx/activity/c;

    .line 153
    .line 154
    const/4 v0, 0x1

    .line 155
    invoke-direct {p2, v0, p0}, Landroidx/activity/c;-><init>(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const-string v0, "android:support:fragments"

    .line 159
    .line 160
    invoke-virtual {p1, v0, p2}, Lx0/b;->c(Ljava/lang/String;Lx0/b$b;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v0}, Lx0/b;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_8

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->W(Landroid/os/Parcelable;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 173
    .line 174
    instance-of p2, p1, Landroidx/activity/result/f;

    .line 175
    .line 176
    if-eqz p2, :cond_a

    .line 177
    .line 178
    check-cast p1, Landroidx/activity/result/f;

    .line 179
    .line 180
    invoke-interface {p1}, Landroidx/activity/result/f;->q()Landroidx/activity/result/e;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p3, :cond_9

    .line 185
    .line 186
    new-instance p2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    iget-object v0, p3, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v0, ":"

    .line 197
    .line 198
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    goto :goto_3

    .line 206
    :cond_9
    const-string p2, ""

    .line 207
    .line 208
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v1, "FragmentManager:"

    .line 211
    .line 212
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string v1, "StartActivityForResult"

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v1, Lb/b;

    .line 240
    .line 241
    invoke-direct {v1}, Lb/b;-><init>()V

    .line 242
    .line 243
    .line 244
    new-instance v2, Landroidx/fragment/app/a0$h;

    .line 245
    .line 246
    invoke-direct {v2, p0}, Landroidx/fragment/app/a0$h;-><init>(Landroidx/fragment/app/a0;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v0, v1, v2}, Landroidx/activity/result/e;->b(Ljava/lang/String;Landroidx/activity/result/c;Landroidx/activity/result/b;)Landroidx/activity/result/d;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iput-object v0, p0, Landroidx/fragment/app/a0;->z:Landroidx/activity/result/d;

    .line 254
    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v1, "StartIntentSenderForResult"

    .line 264
    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v1, Landroidx/fragment/app/a0$j;

    .line 273
    .line 274
    invoke-direct {v1}, Landroidx/fragment/app/a0$j;-><init>()V

    .line 275
    .line 276
    .line 277
    new-instance v2, Landroidx/fragment/app/a0$i;

    .line 278
    .line 279
    invoke-direct {v2, p0}, Landroidx/fragment/app/a0$i;-><init>(Landroidx/fragment/app/a0;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, v0, v1, v2}, Landroidx/activity/result/e;->b(Ljava/lang/String;Landroidx/activity/result/c;Landroidx/activity/result/b;)Landroidx/activity/result/d;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    iput-object v0, p0, Landroidx/fragment/app/a0;->A:Landroidx/activity/result/d;

    .line 287
    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string p2, "RequestPermissions"

    .line 297
    .line 298
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    new-instance v0, Lb/a;

    .line 306
    .line 307
    invoke-direct {v0}, Lb/a;-><init>()V

    .line 308
    .line 309
    .line 310
    new-instance v1, Landroidx/fragment/app/a0$a;

    .line 311
    .line 312
    invoke-direct {v1, p0}, Landroidx/fragment/app/a0$a;-><init>(Landroidx/fragment/app/a0;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1, p2, v0, v1}, Landroidx/activity/result/e;->b(Ljava/lang/String;Landroidx/activity/result/c;Landroidx/activity/result/b;)Landroidx/activity/result/d;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    iput-object p1, p0, Landroidx/fragment/app/a0;->B:Landroidx/activity/result/d;

    .line 320
    .line 321
    :cond_a
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 322
    .line 323
    instance-of p2, p1, Lw/b;

    .line 324
    .line 325
    if-eqz p2, :cond_b

    .line 326
    .line 327
    check-cast p1, Lw/b;

    .line 328
    .line 329
    iget-object p2, p0, Landroidx/fragment/app/a0;->n:Landroidx/fragment/app/z;

    .line 330
    .line 331
    invoke-interface {p1, p2}, Lw/b;->i(Landroidx/fragment/app/z;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 335
    .line 336
    instance-of p2, p1, Lw/c;

    .line 337
    .line 338
    if-eqz p2, :cond_c

    .line 339
    .line 340
    check-cast p1, Lw/c;

    .line 341
    .line 342
    iget-object p2, p0, Landroidx/fragment/app/a0;->o:Landroidx/fragment/app/q;

    .line 343
    .line 344
    invoke-interface {p1, p2}, Lw/c;->f(Landroidx/fragment/app/q;)V

    .line 345
    .line 346
    .line 347
    :cond_c
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 348
    .line 349
    instance-of p2, p1, Lv/l;

    .line 350
    .line 351
    if-eqz p2, :cond_d

    .line 352
    .line 353
    check-cast p1, Lv/l;

    .line 354
    .line 355
    iget-object p2, p0, Landroidx/fragment/app/a0;->p:Landroidx/activity/g;

    .line 356
    .line 357
    invoke-interface {p1, p2}, Lv/l;->n(Landroidx/activity/g;)V

    .line 358
    .line 359
    .line 360
    :cond_d
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 361
    .line 362
    instance-of p2, p1, Lv/m;

    .line 363
    .line 364
    if-eqz p2, :cond_e

    .line 365
    .line 366
    check-cast p1, Lv/m;

    .line 367
    .line 368
    iget-object p2, p0, Landroidx/fragment/app/a0;->q:Landroidx/fragment/app/z;

    .line 369
    .line 370
    invoke-interface {p1, p2}, Lv/m;->s(Landroidx/fragment/app/z;)V

    .line 371
    .line 372
    .line 373
    :cond_e
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 374
    .line 375
    instance-of p2, p1, Lf0/n;

    .line 376
    .line 377
    if-eqz p2, :cond_f

    .line 378
    .line 379
    if-nez p3, :cond_f

    .line 380
    .line 381
    check-cast p1, Lf0/n;

    .line 382
    .line 383
    iget-object p2, p0, Landroidx/fragment/app/a0;->r:Landroidx/fragment/app/a0$c;

    .line 384
    .line 385
    invoke-interface {p1, p2}, Lf0/n;->c(Landroidx/fragment/app/a0$c;)V

    .line 386
    .line 387
    .line 388
    :cond_f
    return-void

    .line 389
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 390
    .line 391
    const-string p2, "Already attached"

    .line 392
    .line 393
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw p1
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
.end method

.method public final c0(Landroidx/fragment/app/o;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->F(Landroidx/fragment/app/o;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-object v1, p1, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v3, v1, Landroidx/fragment/app/o$c;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    move v4, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v4, v1, Landroidx/fragment/app/o$c;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v4, v3

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    move v3, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v3, v1, Landroidx/fragment/app/o$c;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v3, v4

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    move v1, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v1, v1, Landroidx/fragment/app/o$c;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v1, v3

    .line 37
    if-lez v1, :cond_7

    .line 38
    .line 39
    const v1, 0x7f09026a

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroidx/fragment/app/o;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v2, p1, Landroidx/fragment/app/o$c;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, v0, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/o;->e()Landroidx/fragment/app/o$c;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-boolean v2, p1, Landroidx/fragment/app/o$c;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
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

.method public final d(Landroidx/fragment/app/o;)V
    .locals 4

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "attach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/o;->A:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/o;->A:Z

    iget-boolean v1, p1, Landroidx/fragment/app/o;->l:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/h0;->a(Landroidx/fragment/app/o;)V

    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "add from attach: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/a0;->K(Landroidx/fragment/app/o;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/a0;->D:Z

    :cond_2
    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/a0;->b:Z

    iget-object v0, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->e()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/g0;

    .line 22
    .line 23
    iget-object v2, v1, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 24
    .line 25
    iget-boolean v3, v2, Landroidx/fragment/app/o;->G:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-boolean v3, p0, Landroidx/fragment/app/a0;->b:Z

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->H:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, v2, Landroidx/fragment/app/o;->G:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/fragment/app/g0;->k()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final f()Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/fragment/app/h0;->e()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/g0;

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 29
    .line 30
    iget-object v2, v2, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->H()Landroidx/fragment/app/y0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v2, v3}, Landroidx/fragment/app/v0;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/y0;)Landroidx/fragment/app/v0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final f0(Ljava/lang/IllegalStateException;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Activity state:"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroidx/fragment/app/s0;

    invoke-direct {v0}, Landroidx/fragment/app/s0;-><init>()V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    const-string v3, "  "

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    new-array v3, v4, [Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/w;->A(Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-array v0, v4, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4, v2, v0}, Landroidx/fragment/app/a0;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    throw p1
.end method

.method public final g(Landroidx/fragment/app/o;)Landroidx/fragment/app/g0;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/fragment/app/g0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Landroidx/fragment/app/g0;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/fragment/app/a0;->l:Landroidx/fragment/app/y;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/g0;-><init>(Landroidx/fragment/app/y;Landroidx/fragment/app/h0;Landroidx/fragment/app/o;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/fragment/app/w;->d:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Landroidx/fragment/app/g0;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Landroidx/fragment/app/a0;->s:I

    .line 37
    .line 38
    iput p1, v0, Landroidx/fragment/app/g0;->e:I

    .line 39
    .line 40
    return-object v0
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

.method public final g0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/a0;->h:Landroidx/fragment/app/a0$b;

    .line 14
    .line 15
    iput-boolean v2, v1, Landroidx/activity/f;->a:Z

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/activity/f;->c:Le0/a;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Le0/a;->accept(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v0, p0, Landroidx/fragment/app/a0;->h:Landroidx/fragment/app/a0$b;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v1, v3

    .line 45
    :goto_1
    if-lez v1, :cond_3

    .line 46
    .line 47
    iget-object v1, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    .line 48
    .line 49
    invoke-static {v1}, Landroidx/fragment/app/a0;->N(Landroidx/fragment/app/o;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move v2, v3

    .line 57
    :goto_2
    iput-boolean v2, v0, Landroidx/activity/f;->a:Z

    .line 58
    .line 59
    iget-object v0, v0, Landroidx/activity/f;->c:Le0/a;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v0, v1}, Le0/a;->accept(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_4
    return-void

    .line 71
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw v1
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final h(Landroidx/fragment/app/o;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/o;->A:Z

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p1, Landroidx/fragment/app/o;->A:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Landroidx/fragment/app/o;->l:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 62
    .line 63
    iget-object v2, v0, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v2

    .line 68
    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Landroidx/fragment/app/o;->l:Z

    .line 78
    .line 79
    invoke-static {p1}, Landroidx/fragment/app/a0;->K(Landroidx/fragment/app/o;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->D:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->c0(Landroidx/fragment/app/o;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_3
    :goto_0
    return-void
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

.method public final i(ZLandroid/content/res/Configuration;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 4
    .line 5
    instance-of v0, v0, Lw/b;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->f0(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/fragment/app/o;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, p2}, Landroidx/fragment/app/o;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, v2, p2}, Landroidx/fragment/app/a0;->i(ZLandroid/content/res/Configuration;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final j()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/a0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/o;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Landroidx/fragment/app/o;->z:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/a0;->j()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v1
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final k()Z
    .locals 7

    .line 1
    iget v0, p0, Landroidx/fragment/app/a0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Landroidx/fragment/app/o;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Landroidx/fragment/app/a0;->M(Landroidx/fragment/app/o;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Landroidx/fragment/app/o;->z:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 45
    .line 46
    invoke-virtual {v6}, Landroidx/fragment/app/a0;->k()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    or-int/2addr v6, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v6, v1

    .line 53
    :goto_1
    if-eqz v6, :cond_1

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    new-instance v3, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move v4, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/a0;->e:Ljava/util/ArrayList;

    .line 68
    .line 69
    if-eqz v0, :cond_7

    .line 70
    .line 71
    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/a0;->e:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-ge v1, v0, :cond_7

    .line 78
    .line 79
    iget-object v0, p0, Landroidx/fragment/app/a0;->e:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Landroidx/fragment/app/o;

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_6

    .line 94
    .line 95
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_7
    iput-object v3, p0, Landroidx/fragment/app/a0;->e:Ljava/util/ArrayList;

    .line 102
    .line 103
    return v4
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final l()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/a0;->G:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->z(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->w()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 11
    .line 12
    instance-of v2, v1, Landroidx/lifecycle/l0;

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v0, v3, Landroidx/fragment/app/h0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/fragment/app/d0;

    .line 21
    .line 22
    iget-boolean v0, v0, Landroidx/fragment/app/d0;->h:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, v1, Landroidx/fragment/app/w;->d:Landroid/content/Context;

    .line 26
    .line 27
    instance-of v2, v1, Landroid/app/Activity;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    check-cast v1, Landroid/app/Activity;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    xor-int/2addr v0, v1

    .line 38
    :cond_1
    :goto_0
    if-eqz v0, :cond_4

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/fragment/app/a0;->j:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Landroidx/fragment/app/c;

    .line 61
    .line 62
    iget-object v1, v1, Landroidx/fragment/app/c;->b:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v4, v3, Landroidx/fragment/app/h0;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, Landroidx/fragment/app/d0;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const/4 v5, 0x3

    .line 88
    invoke-static {v5}, Landroidx/fragment/app/a0;->J(I)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    new-instance v5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v6, "Clearing non-config state for saved state of Fragment "

    .line 97
    .line 98
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    const-string v6, "FragmentManager"

    .line 109
    .line 110
    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-virtual {v4, v2}, Landroidx/fragment/app/d0;->e(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    const/4 v0, -0x1

    .line 118
    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->u(I)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 122
    .line 123
    instance-of v1, v0, Lw/c;

    .line 124
    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    check-cast v0, Lw/c;

    .line 128
    .line 129
    iget-object v1, p0, Landroidx/fragment/app/a0;->o:Landroidx/fragment/app/q;

    .line 130
    .line 131
    invoke-interface {v0, v1}, Lw/c;->h(Landroidx/fragment/app/q;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 135
    .line 136
    instance-of v1, v0, Lw/b;

    .line 137
    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    check-cast v0, Lw/b;

    .line 141
    .line 142
    iget-object v1, p0, Landroidx/fragment/app/a0;->n:Landroidx/fragment/app/z;

    .line 143
    .line 144
    invoke-interface {v0, v1}, Lw/b;->o(Landroidx/fragment/app/z;)V

    .line 145
    .line 146
    .line 147
    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 148
    .line 149
    instance-of v1, v0, Lv/l;

    .line 150
    .line 151
    if-eqz v1, :cond_7

    .line 152
    .line 153
    check-cast v0, Lv/l;

    .line 154
    .line 155
    iget-object v1, p0, Landroidx/fragment/app/a0;->p:Landroidx/activity/g;

    .line 156
    .line 157
    invoke-interface {v0, v1}, Lv/l;->r(Landroidx/activity/g;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 161
    .line 162
    instance-of v1, v0, Lv/m;

    .line 163
    .line 164
    if-eqz v1, :cond_8

    .line 165
    .line 166
    check-cast v0, Lv/m;

    .line 167
    .line 168
    iget-object v1, p0, Landroidx/fragment/app/a0;->q:Landroidx/fragment/app/z;

    .line 169
    .line 170
    invoke-interface {v0, v1}, Lv/m;->m(Landroidx/fragment/app/z;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 174
    .line 175
    instance-of v1, v0, Lf0/n;

    .line 176
    .line 177
    if-eqz v1, :cond_9

    .line 178
    .line 179
    check-cast v0, Lf0/n;

    .line 180
    .line 181
    iget-object v1, p0, Landroidx/fragment/app/a0;->r:Landroidx/fragment/app/a0$c;

    .line 182
    .line 183
    invoke-interface {v0, v1}, Lf0/n;->l(Landroidx/fragment/app/a0$c;)V

    .line 184
    .line 185
    .line 186
    :cond_9
    const/4 v0, 0x0

    .line 187
    iput-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 188
    .line 189
    iput-object v0, p0, Landroidx/fragment/app/a0;->u:Landroidx/activity/result/c;

    .line 190
    .line 191
    iput-object v0, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    .line 192
    .line 193
    iget-object v1, p0, Landroidx/fragment/app/a0;->g:Landroidx/activity/OnBackPressedDispatcher;

    .line 194
    .line 195
    if-eqz v1, :cond_b

    .line 196
    .line 197
    iget-object v1, p0, Landroidx/fragment/app/a0;->h:Landroidx/fragment/app/a0$b;

    .line 198
    .line 199
    iget-object v1, v1, Landroidx/activity/f;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_a

    .line 210
    .line 211
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    check-cast v2, Landroidx/activity/a;

    .line 216
    .line 217
    invoke-interface {v2}, Landroidx/activity/a;->cancel()V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_a
    iput-object v0, p0, Landroidx/fragment/app/a0;->g:Landroidx/activity/OnBackPressedDispatcher;

    .line 222
    .line 223
    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/a0;->z:Landroidx/activity/result/d;

    .line 224
    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    invoke-virtual {v0}, Landroidx/activity/result/d;->A()V

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Landroidx/fragment/app/a0;->A:Landroidx/activity/result/d;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroidx/activity/result/d;->A()V

    .line 233
    .line 234
    .line 235
    iget-object v0, p0, Landroidx/fragment/app/a0;->B:Landroidx/activity/result/d;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/activity/result/d;->A()V

    .line 238
    .line 239
    .line 240
    :cond_c
    return-void
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
.end method

.method public final m(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 4
    .line 5
    instance-of v0, v0, Lw/c;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->f0(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/fragment/app/o;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/fragment/app/o;->onLowMemory()V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, v2}, Landroidx/fragment/app/a0;->m(Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
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

.method public final n(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    instance-of v0, v0, Lv/l;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->f0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/o;

    if-eqz v1, :cond_2

    if-eqz p2, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/a0;->n(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    invoke-virtual {v0}, Landroidx/fragment/app/h0;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/o;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/o;->r()Z

    iget-object v1, v1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    invoke-virtual {v1}, Landroidx/fragment/app/a0;->o()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final p()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/a0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/o;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Landroidx/fragment/app/o;->z:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/a0;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v1
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final q()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/a0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/fragment/app/o;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v1, Landroidx/fragment/app/o;->z:Z

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/a0;->q()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final r(Landroidx/fragment/app/o;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->C(Ljava/lang/String;)Landroidx/fragment/app/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/fragment/app/o;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Landroidx/fragment/app/a0;->N(Landroidx/fragment/app/o;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p1, Landroidx/fragment/app/o;->k:Ljava/lang/Boolean;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eq v1, v0, :cond_1

    .line 33
    .line 34
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p1, Landroidx/fragment/app/o;->k:Ljava/lang/Boolean;

    .line 39
    .line 40
    iget-object p1, p1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/fragment/app/a0;->g0()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, Landroidx/fragment/app/a0;->w:Landroidx/fragment/app/o;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroidx/fragment/app/a0;->r(Landroidx/fragment/app/o;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
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

.method public final s(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    instance-of v0, v0, Lv/m;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->f0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/o;

    if-eqz v1, :cond_2

    if-eqz p2, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/a0;->s(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final t()Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/fragment/app/a0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->g()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move v3, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroidx/fragment/app/o;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, Landroidx/fragment/app/a0;->M(Landroidx/fragment/app/o;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-boolean v5, v4, Landroidx/fragment/app/o;->z:Z

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    iget-object v4, v4, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroidx/fragment/app/a0;->t()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    or-int/2addr v4, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v4, v1

    .line 52
    :goto_1
    if-eqz v4, :cond_1

    .line 53
    .line 54
    move v3, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return v3
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    :goto_0
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/a0;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 6
    .line 7
    iget-object v2, v2, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroidx/fragment/app/g0;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Landroidx/fragment/app/g0;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/a0;->P(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->f()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroidx/fragment/app/v0;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/fragment/app/v0;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->b:Z

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroidx/fragment/app/a0;->z(Z)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    iput-boolean v1, p0, Landroidx/fragment/app/a0;->b:Z

    .line 71
    .line 72
    throw p1
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

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "    "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, "    "

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, v1, Landroidx/fragment/app/h0;->b:Ljava/lang/Cloneable;

    .line 41
    .line 42
    check-cast v3, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x0

    .line 49
    if-nez v4, :cond_1b

    .line 50
    .line 51
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v4, "Active Fragments:"

    .line 55
    .line 56
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1b

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Landroidx/fragment/app/g0;

    .line 78
    .line 79
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    if-eqz v4, :cond_1a

    .line 83
    .line 84
    iget-object v4, v4, Landroidx/fragment/app/g0;->c:Landroidx/fragment/app/o;

    .line 85
    .line 86
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v6, "mFragmentId=#"

    .line 96
    .line 97
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget v6, v4, Landroidx/fragment/app/o;->w:I

    .line 101
    .line 102
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string v6, " mContainerId=#"

    .line 110
    .line 111
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget v6, v4, Landroidx/fragment/app/o;->x:I

    .line 115
    .line 116
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v6, " mTag="

    .line 124
    .line 125
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object v6, v4, Landroidx/fragment/app/o;->y:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string v6, "mState="

    .line 137
    .line 138
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget v6, v4, Landroidx/fragment/app/o;->b:I

    .line 142
    .line 143
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    .line 144
    .line 145
    .line 146
    const-string v6, " mWho="

    .line 147
    .line 148
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v6, v4, Landroidx/fragment/app/o;->f:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v6, " mBackStackNesting="

    .line 157
    .line 158
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iget v6, v4, Landroidx/fragment/app/o;->r:I

    .line 162
    .line 163
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v6, "mAdded="

    .line 170
    .line 171
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-boolean v6, v4, Landroidx/fragment/app/o;->l:Z

    .line 175
    .line 176
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 177
    .line 178
    .line 179
    const-string v6, " mRemoving="

    .line 180
    .line 181
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iget-boolean v6, v4, Landroidx/fragment/app/o;->m:Z

    .line 185
    .line 186
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 187
    .line 188
    .line 189
    const-string v6, " mFromLayout="

    .line 190
    .line 191
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-boolean v6, v4, Landroidx/fragment/app/o;->n:Z

    .line 195
    .line 196
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 197
    .line 198
    .line 199
    const-string v6, " mInLayout="

    .line 200
    .line 201
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-boolean v6, v4, Landroidx/fragment/app/o;->o:Z

    .line 205
    .line 206
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-string v6, "mHidden="

    .line 213
    .line 214
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-boolean v6, v4, Landroidx/fragment/app/o;->z:Z

    .line 218
    .line 219
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 220
    .line 221
    .line 222
    const-string v6, " mDetached="

    .line 223
    .line 224
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    iget-boolean v6, v4, Landroidx/fragment/app/o;->A:Z

    .line 228
    .line 229
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 230
    .line 231
    .line 232
    const-string v6, " mMenuVisible="

    .line 233
    .line 234
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v6, v4, Landroidx/fragment/app/o;->C:Z

    .line 238
    .line 239
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 240
    .line 241
    .line 242
    const-string v6, " mHasMenu="

    .line 243
    .line 244
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const-string v6, "mRetainInstance="

    .line 254
    .line 255
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iget-boolean v6, v4, Landroidx/fragment/app/o;->B:Z

    .line 259
    .line 260
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 261
    .line 262
    .line 263
    const-string v6, " mUserVisibleHint="

    .line 264
    .line 265
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget-boolean v6, v4, Landroidx/fragment/app/o;->H:Z

    .line 269
    .line 270
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 271
    .line 272
    .line 273
    iget-object v6, v4, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 274
    .line 275
    if-eqz v6, :cond_0

    .line 276
    .line 277
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const-string v6, "mFragmentManager="

    .line 281
    .line 282
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-object v6, v4, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 286
    .line 287
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :cond_0
    iget-object v6, v4, Landroidx/fragment/app/o;->t:Landroidx/fragment/app/w;

    .line 291
    .line 292
    if-eqz v6, :cond_1

    .line 293
    .line 294
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    const-string v6, "mHost="

    .line 298
    .line 299
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    iget-object v6, v4, Landroidx/fragment/app/o;->t:Landroidx/fragment/app/w;

    .line 303
    .line 304
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_1
    iget-object v6, v4, Landroidx/fragment/app/o;->v:Landroidx/fragment/app/o;

    .line 308
    .line 309
    if-eqz v6, :cond_2

    .line 310
    .line 311
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    const-string v6, "mParentFragment="

    .line 315
    .line 316
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    iget-object v6, v4, Landroidx/fragment/app/o;->v:Landroidx/fragment/app/o;

    .line 320
    .line 321
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_2
    iget-object v6, v4, Landroidx/fragment/app/o;->g:Landroid/os/Bundle;

    .line 325
    .line 326
    if-eqz v6, :cond_3

    .line 327
    .line 328
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const-string v6, "mArguments="

    .line 332
    .line 333
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v6, v4, Landroidx/fragment/app/o;->g:Landroid/os/Bundle;

    .line 337
    .line 338
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :cond_3
    iget-object v6, v4, Landroidx/fragment/app/o;->c:Landroid/os/Bundle;

    .line 342
    .line 343
    if-eqz v6, :cond_4

    .line 344
    .line 345
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const-string v6, "mSavedFragmentState="

    .line 349
    .line 350
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    iget-object v6, v4, Landroidx/fragment/app/o;->c:Landroid/os/Bundle;

    .line 354
    .line 355
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :cond_4
    iget-object v6, v4, Landroidx/fragment/app/o;->d:Landroid/util/SparseArray;

    .line 359
    .line 360
    if-eqz v6, :cond_5

    .line 361
    .line 362
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-string v6, "mSavedViewState="

    .line 366
    .line 367
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget-object v6, v4, Landroidx/fragment/app/o;->d:Landroid/util/SparseArray;

    .line 371
    .line 372
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :cond_5
    iget-object v6, v4, Landroidx/fragment/app/o;->e:Landroid/os/Bundle;

    .line 376
    .line 377
    if-eqz v6, :cond_6

    .line 378
    .line 379
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    const-string v6, "mSavedViewRegistryState="

    .line 383
    .line 384
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iget-object v6, v4, Landroidx/fragment/app/o;->e:Landroid/os/Bundle;

    .line 388
    .line 389
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    :cond_6
    iget-object v6, v4, Landroidx/fragment/app/o;->h:Landroidx/fragment/app/o;

    .line 393
    .line 394
    if-eqz v6, :cond_7

    .line 395
    .line 396
    goto :goto_1

    .line 397
    :cond_7
    iget-object v6, v4, Landroidx/fragment/app/o;->s:Landroidx/fragment/app/a0;

    .line 398
    .line 399
    if-eqz v6, :cond_8

    .line 400
    .line 401
    iget-object v7, v4, Landroidx/fragment/app/o;->i:Ljava/lang/String;

    .line 402
    .line 403
    if-eqz v7, :cond_8

    .line 404
    .line 405
    invoke-virtual {v6, v7}, Landroidx/fragment/app/a0;->C(Ljava/lang/String;)Landroidx/fragment/app/o;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    goto :goto_1

    .line 410
    :cond_8
    const/4 v6, 0x0

    .line 411
    :goto_1
    if-eqz v6, :cond_9

    .line 412
    .line 413
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    const-string v7, "mTarget="

    .line 417
    .line 418
    invoke-virtual {p3, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    const-string v6, " mTargetRequestCode="

    .line 425
    .line 426
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    iget v6, v4, Landroidx/fragment/app/o;->j:I

    .line 430
    .line 431
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 432
    .line 433
    .line 434
    :cond_9
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    const-string v6, "mPopDirection="

    .line 438
    .line 439
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 443
    .line 444
    if-nez v6, :cond_a

    .line 445
    .line 446
    move v6, v5

    .line 447
    goto :goto_2

    .line 448
    :cond_a
    iget-boolean v6, v6, Landroidx/fragment/app/o$c;->a:Z

    .line 449
    .line 450
    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 451
    .line 452
    .line 453
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 454
    .line 455
    if-nez v6, :cond_b

    .line 456
    .line 457
    move v6, v5

    .line 458
    goto :goto_3

    .line 459
    :cond_b
    iget v6, v6, Landroidx/fragment/app/o$c;->b:I

    .line 460
    .line 461
    :goto_3
    if-eqz v6, :cond_d

    .line 462
    .line 463
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    const-string v6, "getEnterAnim="

    .line 467
    .line 468
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 472
    .line 473
    if-nez v6, :cond_c

    .line 474
    .line 475
    move v6, v5

    .line 476
    goto :goto_4

    .line 477
    :cond_c
    iget v6, v6, Landroidx/fragment/app/o$c;->b:I

    .line 478
    .line 479
    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 480
    .line 481
    .line 482
    :cond_d
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 483
    .line 484
    if-nez v6, :cond_e

    .line 485
    .line 486
    move v6, v5

    .line 487
    goto :goto_5

    .line 488
    :cond_e
    iget v6, v6, Landroidx/fragment/app/o$c;->c:I

    .line 489
    .line 490
    :goto_5
    if-eqz v6, :cond_10

    .line 491
    .line 492
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    const-string v6, "getExitAnim="

    .line 496
    .line 497
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 501
    .line 502
    if-nez v6, :cond_f

    .line 503
    .line 504
    move v6, v5

    .line 505
    goto :goto_6

    .line 506
    :cond_f
    iget v6, v6, Landroidx/fragment/app/o$c;->c:I

    .line 507
    .line 508
    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 509
    .line 510
    .line 511
    :cond_10
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 512
    .line 513
    if-nez v6, :cond_11

    .line 514
    .line 515
    move v6, v5

    .line 516
    goto :goto_7

    .line 517
    :cond_11
    iget v6, v6, Landroidx/fragment/app/o$c;->d:I

    .line 518
    .line 519
    :goto_7
    if-eqz v6, :cond_13

    .line 520
    .line 521
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    const-string v6, "getPopEnterAnim="

    .line 525
    .line 526
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 530
    .line 531
    if-nez v6, :cond_12

    .line 532
    .line 533
    move v6, v5

    .line 534
    goto :goto_8

    .line 535
    :cond_12
    iget v6, v6, Landroidx/fragment/app/o$c;->d:I

    .line 536
    .line 537
    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 538
    .line 539
    .line 540
    :cond_13
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 541
    .line 542
    if-nez v6, :cond_14

    .line 543
    .line 544
    move v6, v5

    .line 545
    goto :goto_9

    .line 546
    :cond_14
    iget v6, v6, Landroidx/fragment/app/o$c;->e:I

    .line 547
    .line 548
    :goto_9
    if-eqz v6, :cond_16

    .line 549
    .line 550
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    const-string v6, "getPopExitAnim="

    .line 554
    .line 555
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    iget-object v6, v4, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 559
    .line 560
    if-nez v6, :cond_15

    .line 561
    .line 562
    move v6, v5

    .line 563
    goto :goto_a

    .line 564
    :cond_15
    iget v6, v6, Landroidx/fragment/app/o$c;->e:I

    .line 565
    .line 566
    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 567
    .line 568
    .line 569
    :cond_16
    iget-object v6, v4, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    .line 570
    .line 571
    if-eqz v6, :cond_17

    .line 572
    .line 573
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    const-string v6, "mContainer="

    .line 577
    .line 578
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    iget-object v6, v4, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    .line 582
    .line 583
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    :cond_17
    iget-object v6, v4, Landroidx/fragment/app/o;->F:Landroid/view/View;

    .line 587
    .line 588
    if-eqz v6, :cond_18

    .line 589
    .line 590
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    const-string v6, "mView="

    .line 594
    .line 595
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    iget-object v6, v4, Landroidx/fragment/app/o;->F:Landroid/view/View;

    .line 599
    .line 600
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    :cond_18
    invoke-virtual {v4}, Landroidx/fragment/app/o;->h()Landroid/content/Context;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    if-eqz v6, :cond_19

    .line 608
    .line 609
    new-instance v6, Lv0/a;

    .line 610
    .line 611
    invoke-interface {v4}, Landroidx/lifecycle/l0;->t()Landroidx/lifecycle/k0;

    .line 612
    .line 613
    .line 614
    move-result-object v7

    .line 615
    invoke-direct {v6, v4, v7}, Lv0/a;-><init>(Landroidx/lifecycle/o;Landroidx/lifecycle/k0;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6, v2, p3}, Lv0/a;->A(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 619
    .line 620
    .line 621
    :cond_19
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    new-instance v6, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    const-string v7, "Child "

    .line 627
    .line 628
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    iget-object v7, v4, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 632
    .line 633
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    const-string v7, ":"

    .line 637
    .line 638
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v6

    .line 645
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    iget-object v4, v4, Landroidx/fragment/app/o;->u:Landroidx/fragment/app/b0;

    .line 649
    .line 650
    new-instance v6, Ljava/lang/StringBuilder;

    .line 651
    .line 652
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    const-string v7, "  "

    .line 659
    .line 660
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v6

    .line 667
    invoke-virtual {v4, v6, p2, p3, p4}, Landroidx/fragment/app/a0;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_0

    .line 671
    .line 672
    :cond_1a
    const-string v4, "null"

    .line 673
    .line 674
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    goto/16 :goto_0

    .line 678
    .line 679
    :cond_1b
    iget-object p2, v1, Landroidx/fragment/app/h0;->a:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast p2, Ljava/util/ArrayList;

    .line 682
    .line 683
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 684
    .line 685
    .line 686
    move-result p4

    .line 687
    if-lez p4, :cond_1c

    .line 688
    .line 689
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    const-string v1, "Added Fragments:"

    .line 693
    .line 694
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    move v1, v5

    .line 698
    :goto_b
    if-ge v1, p4, :cond_1c

    .line 699
    .line 700
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    check-cast v2, Landroidx/fragment/app/o;

    .line 705
    .line 706
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    const-string v3, "  #"

    .line 710
    .line 711
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 715
    .line 716
    .line 717
    const-string v3, ": "

    .line 718
    .line 719
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2}, Landroidx/fragment/app/o;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    add-int/lit8 v1, v1, 0x1

    .line 730
    .line 731
    goto :goto_b

    .line 732
    :cond_1c
    iget-object p2, p0, Landroidx/fragment/app/a0;->e:Ljava/util/ArrayList;

    .line 733
    .line 734
    if-eqz p2, :cond_1d

    .line 735
    .line 736
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 737
    .line 738
    .line 739
    move-result p2

    .line 740
    if-lez p2, :cond_1d

    .line 741
    .line 742
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    const-string p4, "Fragments Created Menus:"

    .line 746
    .line 747
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    move p4, v5

    .line 751
    :goto_c
    if-ge p4, p2, :cond_1d

    .line 752
    .line 753
    iget-object v1, p0, Landroidx/fragment/app/a0;->e:Ljava/util/ArrayList;

    .line 754
    .line 755
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    check-cast v1, Landroidx/fragment/app/o;

    .line 760
    .line 761
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    const-string v2, "  #"

    .line 765
    .line 766
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 770
    .line 771
    .line 772
    const-string v2, ": "

    .line 773
    .line 774
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1}, Landroidx/fragment/app/o;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    add-int/lit8 p4, p4, 0x1

    .line 785
    .line 786
    goto :goto_c

    .line 787
    :cond_1d
    iget-object p2, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 788
    .line 789
    if-eqz p2, :cond_1e

    .line 790
    .line 791
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 792
    .line 793
    .line 794
    move-result p2

    .line 795
    if-lez p2, :cond_1e

    .line 796
    .line 797
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    const-string p4, "Back Stack:"

    .line 801
    .line 802
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    move p4, v5

    .line 806
    :goto_d
    if-ge p4, p2, :cond_1e

    .line 807
    .line 808
    iget-object v1, p0, Landroidx/fragment/app/a0;->d:Ljava/util/ArrayList;

    .line 809
    .line 810
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    check-cast v1, Landroidx/fragment/app/a;

    .line 815
    .line 816
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    const-string v2, "  #"

    .line 820
    .line 821
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 825
    .line 826
    .line 827
    const-string v2, ": "

    .line 828
    .line 829
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    const/4 v2, 0x1

    .line 840
    invoke-virtual {v1, v0, p3, v2}, Landroidx/fragment/app/a;->g(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 841
    .line 842
    .line 843
    add-int/lit8 p4, p4, 0x1

    .line 844
    .line 845
    goto :goto_d

    .line 846
    :cond_1e
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    new-instance p2, Ljava/lang/StringBuilder;

    .line 850
    .line 851
    const-string p4, "Back Stack Index: "

    .line 852
    .line 853
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    iget-object p4, p0, Landroidx/fragment/app/a0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 857
    .line 858
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 859
    .line 860
    .line 861
    move-result p4

    .line 862
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object p2

    .line 869
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    iget-object p2, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 873
    .line 874
    monitor-enter p2

    .line 875
    :try_start_0
    iget-object p4, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 876
    .line 877
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 878
    .line 879
    .line 880
    move-result p4

    .line 881
    if-lez p4, :cond_1f

    .line 882
    .line 883
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    const-string v0, "Pending Actions:"

    .line 887
    .line 888
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    :goto_e
    if-ge v5, p4, :cond_1f

    .line 892
    .line 893
    iget-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 894
    .line 895
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    check-cast v0, Landroidx/fragment/app/a0$m;

    .line 900
    .line 901
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    const-string v1, "  #"

    .line 905
    .line 906
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 910
    .line 911
    .line 912
    const-string v1, ": "

    .line 913
    .line 914
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    add-int/lit8 v5, v5, 0x1

    .line 921
    .line 922
    goto :goto_e

    .line 923
    :cond_1f
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 924
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    const-string p2, "FragmentManager misc state:"

    .line 928
    .line 929
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    const-string p2, "  mHost="

    .line 936
    .line 937
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    iget-object p2, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 941
    .line 942
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    const-string p2, "  mContainer="

    .line 949
    .line 950
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    iget-object p2, p0, Landroidx/fragment/app/a0;->u:Landroidx/activity/result/c;

    .line 954
    .line 955
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    iget-object p2, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    .line 959
    .line 960
    if-eqz p2, :cond_20

    .line 961
    .line 962
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    const-string p2, "  mParent="

    .line 966
    .line 967
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    iget-object p2, p0, Landroidx/fragment/app/a0;->v:Landroidx/fragment/app/o;

    .line 971
    .line 972
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    :cond_20
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    const-string p2, "  mCurState="

    .line 979
    .line 980
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    iget p2, p0, Landroidx/fragment/app/a0;->s:I

    .line 984
    .line 985
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 986
    .line 987
    .line 988
    const-string p2, " mStateSaved="

    .line 989
    .line 990
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    iget-boolean p2, p0, Landroidx/fragment/app/a0;->E:Z

    .line 994
    .line 995
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 996
    .line 997
    .line 998
    const-string p2, " mStopped="

    .line 999
    .line 1000
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    iget-boolean p2, p0, Landroidx/fragment/app/a0;->F:Z

    .line 1004
    .line 1005
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1006
    .line 1007
    .line 1008
    const-string p2, " mDestroyed="

    .line 1009
    .line 1010
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    iget-boolean p2, p0, Landroidx/fragment/app/a0;->G:Z

    .line 1014
    .line 1015
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1016
    .line 1017
    .line 1018
    iget-boolean p2, p0, Landroidx/fragment/app/a0;->D:Z

    .line 1019
    .line 1020
    if-eqz p2, :cond_21

    .line 1021
    .line 1022
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    const-string p1, "  mNeedMenuInvalidate="

    .line 1026
    .line 1027
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1028
    .line 1029
    .line 1030
    iget-boolean p1, p0, Landroidx/fragment/app/a0;->D:Z

    .line 1031
    .line 1032
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 1033
    .line 1034
    .line 1035
    :cond_21
    return-void

    .line 1036
    :catchall_0
    move-exception p1

    .line 1037
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1038
    throw p1
.end method

.method public final w()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/a0;->f()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/v0;

    invoke-virtual {v1}, Landroidx/fragment/app/v0;->e()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final x(Landroidx/fragment/app/a0$m;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Landroidx/fragment/app/a0;->G:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "FragmentManager has not been attached to a host."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->O()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 43
    .line 44
    monitor-enter v0

    .line 45
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 46
    .line 47
    if-nez v1, :cond_5

    .line 48
    .line 49
    if-eqz p2, :cond_4

    .line 50
    .line 51
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "Activity has been destroyed"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_5
    iget-object p2, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->Y()V

    .line 67
    .line 68
    .line 69
    monitor-exit v0

    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw p1
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final y(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/a0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/a0;->G:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "FragmentManager has been destroyed"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "FragmentManager has not been attached to a host."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/w;->e:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_5

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->O()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "Can not perform this action after onSaveInstanceState"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 61
    .line 62
    if-nez p1, :cond_4

    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 70
    .line 71
    new-instance p1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    .line 77
    .line 78
    :cond_4
    return-void

    .line 79
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "Must be called from main thread of fragment host"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string v0, "FragmentManager is already executing transactions"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1
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

.method public final z(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a0;->y(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_1
    iget-object v4, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    move v5, p1

    .line 31
    move v6, v5

    .line 32
    :goto_1
    if-ge v5, v4, :cond_1

    .line 33
    .line 34
    iget-object v7, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Landroidx/fragment/app/a0$m;

    .line 41
    .line 42
    invoke-interface {v7, v1, v2}, Landroidx/fragment/app/a0$m;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 43
    .line 44
    .line 45
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    or-int/2addr v6, v7

    .line 47
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :try_start_2
    iget-object v1, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/w;->e:Landroid/os/Handler;

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/fragment/app/a0;->M:Landroidx/fragment/app/a0$f;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 65
    :goto_2
    if-eqz v6, :cond_2

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    iput-boolean v0, p0, Landroidx/fragment/app/a0;->b:Z

    .line 69
    .line 70
    :try_start_3
    iget-object v1, p0, Landroidx/fragment/app/a0;->I:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v2, p0, Landroidx/fragment/app/a0;->J:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/a0;->V(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->g0()V

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p0, Landroidx/fragment/app/a0;->H:Z

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iput-boolean p1, p0, Landroidx/fragment/app/a0;->H:Z

    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e0()V

    .line 96
    .line 97
    .line 98
    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/a0;->c:Landroidx/fragment/app/h0;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/fragment/app/h0;->b()V

    .line 101
    .line 102
    .line 103
    return v0

    .line 104
    :catchall_1
    move-exception p1

    .line 105
    :try_start_4
    iget-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Landroidx/fragment/app/a0;->t:Landroidx/fragment/app/w;

    .line 111
    .line 112
    iget-object v0, v0, Landroidx/fragment/app/w;->e:Landroid/os/Handler;

    .line 113
    .line 114
    iget-object v1, p0, Landroidx/fragment/app/a0;->M:Landroidx/fragment/app/a0$f;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :catchall_2
    move-exception p1

    .line 121
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 122
    throw p1
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
